package iguanaman.thaumcraftmobaspects;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import net.minecraft.entity.EntityList;

import com.google.common.base.CharMatcher;
import com.google.common.base.Optional;

public class ModFileCache {

    // Used for Manually Mapping ModId to entities
    private HashMap<String, String> entityPackageToPrefix = new HashMap<String, String>(5);
    public static final String UNKNOWN_CATEGORY = "unknown";
    public static final String PLAYER_CATEGORY = "unknown";
    public static final String CONFIG_FOLDER = "ThaumcraftMobAspects";
    private final File configDirectory;

    private HashMap<String, File> localPathToFile = new HashMap<String, File>();;

    public ModFileCache(File configDirectory) {
        this.configDirectory = configDirectory;
        entityPackageToPrefix.put("net.minecraft.entity.boss", "vanilla");
        entityPackageToPrefix.put("net.minecraft.entity.monster", "vanilla");
        entityPackageToPrefix.put("net.minecraft.entity.passive", "vanilla");
        entityPackageToPrefix.put("net.minecraft.entity.item", "vanillaitem");
        entityPackageToPrefix.put("net.minecraft.entity.player", PLAYER_CATEGORY);
    }

    public Optional<File> getFile(String modId) {
        modId = filterModIdToValidCharacters(modId);
        try {
            File modFile = localPathToFile.get(modId);
            if (modFile == null) {
                modFile = new File(configDirectory, CONFIG_FOLDER + "/" + modId + ".cfg");
                modFile.getParentFile().mkdirs();
                modFile.createNewFile();
                localPathToFile.put(modId, modFile);
            }
            return Optional.of(modFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.absent();
    }

    private String filterModIdToValidCharacters(String modId) {
        return CharMatcher.anyOf("qwertyuiopasdfghjklzxcvbnm0QWERTYUIOPASDFGHJKLZXCVBNM123456789").retainFrom(modId);
    }

    public HashSet<String> getModIds() {
        HashSet<String> modIds = new HashSet<String>();
        for (Object object : EntityList.stringToClassMapping.keySet()) {
            String entityName = (String) object;
            modIds.add(guessModId(entityName));
        }
        modIds.add(PLAYER_CATEGORY);
        return modIds;
    }

    @SuppressWarnings("unchecked")
    public String guessModId(String entityName) {

        if (entityName.contains(".")) {
            return entityName.split("\\.")[0];
        } else {
            Class<?> entityClass = ((Class<?>) EntityList.stringToClassMapping.get(entityName));
            if (entityClass == null) {
                return UNKNOWN_CATEGORY;
            }
            // Search for other entities having the same package that are mod specific
            String packageNeedingId = entityClass.getName();

            if (packageNeedingId.lastIndexOf(".") != -1) {
                // Remove Entity Name (i.e. net.minecraft.bear to net.minecraft)
                packageNeedingId = packageNeedingId.substring(0, packageNeedingId.lastIndexOf("."));
            }
            Set<Entry<Class<?>, String>> fmlNames = EntityList.classToStringMapping.entrySet();
            for (Entry<Class<?>, String> entry : fmlNames) {
                String packageName = entry.getKey().getName();
                if (packageName.lastIndexOf(".") != -1) {
                    packageName = packageName.substring(0, packageName.lastIndexOf("."));
                }
                // If package is equal to packageNeedingId use ModId if it has one
                if (packageNeedingId.equals(packageName) && entry.getValue().contains(".")) {
                    return entry.getValue().split("\\.")[0];
                }
            }

            String manualPrefix = entityPackageToPrefix.get(packageNeedingId);
            if (manualPrefix != null) {
                return manualPrefix;
            }
            // If all else fails, assumed that the ModId is the first part of the package name
            String[] currentParts = packageNeedingId.split("\\.");
            return currentParts.length > 1 ? currentParts[0] : UNKNOWN_CATEGORY;
        }
    }
}
