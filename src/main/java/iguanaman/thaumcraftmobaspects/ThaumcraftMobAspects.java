package iguanaman.thaumcraftmobaspects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import net.minecraft.entity.EntityList;

import com.google.common.base.Optional;
import com.google.common.collect.HashMultimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

@Mod(modid = ModInfo.MODID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION, dependencies = ModInfo.DEPENDENCIES)
public class ThaumcraftMobAspects {

    // The instance of your mod that Forge uses.
    @Instance(ModInfo.MODID)
    public static ThaumcraftMobAspects instance;

    private File configDirectory;

    @EventHandler
    public void pre(FMLPreInitializationEvent event) {
        configDirectory = event.getModConfigurationDirectory();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void post(FMLPostInitializationEvent event) {
        ModFileCache files = new ModFileCache(configDirectory);
        HashSet<String> modIds = files.getModIds();

        HashMultimap<String, ThaumcraftEntity> modIdToMobs = HashMultimap.create();
        // Read Entries from Configuration Files
        for (String modId : modIds) {
            Optional<File> file = files.getFile(modId);
            if (file.isPresent()) {
                readFromFile(file.get(), modIdToMobs.get(modId));
            }
        }

        // Add Default Values that may not be in files
        modIdToMobs.put(
                ModFileCache.PLAYER_CATEGORY,
                new ThaumcraftEntity(
                        "the_iguana_man",
                        bossAspects(
                                5,
                                Aspect.MAN,
                                Aspect.MIND,
                                Aspect.SOUL,
                                Aspect.LIFE,
                                Aspect.MAGIC,
                                Aspect.ELDRITCH,
                                Aspect.ENERGY,
                                Aspect.HUNGER)));
        modIdToMobs.put(
                ModFileCache.PLAYER_CATEGORY,
                new ThaumcraftEntity(
                        "XanderGryphon",
                        bossAspects(
                                5,
                                Aspect.MAN,
                                Aspect.MIND,
                                Aspect.SOUL,
                                Aspect.LIFE,
                                Aspect.MAGIC,
                                Aspect.ELDRITCH,
                                Aspect.ENERGY,
                                Aspect.HUNGER)));

        AspectPlugin[] plugins = new AspectPlugin[] { new PluginLycanitesMobs(), new PluginMoCreatures(),
                new PluginSpecialMobs(), new PluginTwilightForest() };
        for (AspectPlugin aspectPlugin : plugins) {
            if (shouldLoadPlugin(aspectPlugin)) {
                for (ThaumcraftEntity mob : aspectPlugin.getThaumcraftMobs()) {
                    modIdToMobs.put(files.guessModId(mob.entityName), mob);
                }
            }
        }

        // Add Generic Entities that have no values
        for (Object object : EntityList.stringToClassMapping.keySet()) {
            String entityName = (String) object;
            modIdToMobs.put(files.guessModId(entityName), new ThaumcraftEntity(entityName));
        }

        // Write All Entries to File
        for (String modId : modIdToMobs.keySet()) {
            Optional<File> file = files.getFile(modId);
            if (file.isPresent()) {
                saveToFile(file.get(), modIdToMobs.get(modId));
            }
        }

        // Register valid, non-empty entries with our Thaumcraft overlord
        for (ThaumcraftEntity mob : modIdToMobs.values()) {
            AspectList aspectList = new AspectList();
            for (Entry<String, Integer> entry : mob.aspects.entrySet()) {
                Aspect aspect = Aspect.aspects.get(entry.getKey());
                if (aspect != null) {
                    aspectList.add(aspect, entry.getValue());
                }
            }
            if (aspectList.size() > 0) {
                ThaumcraftApi.registerEntityTag(mob.entityName, aspectList);
            }
        }
    }

    private boolean shouldLoadPlugin(AspectPlugin plugin) {
        for (String modID : plugin.getRequiredMods()) {
            if (!Loader.isModLoaded(modID)) {
                return false;
            }
        }
        return true;
    }

    private void readFromFile(File configFile, Set<ThaumcraftEntity> mobs) {
        try {
            Reader reader = new InputStreamReader(new FileInputStream(configFile));
            Gson gson = new GsonBuilder().create();
            // Array is required as GSON seems to have trouble with MultiMapSet
            ThaumcraftEntity[] readMobs = gson.fromJson(reader, ThaumcraftEntity[].class);
            if (readMobs != null) {
                for (ThaumcraftEntity thaumcraftMob : readMobs) {
                    mobs.add(thaumcraftMob);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile(File configFile, Set<ThaumcraftEntity> mobs) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Writer output = new OutputStreamWriter(new FileOutputStream(configFile));
            gson.toJson(mobs, output);
            output.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static AspectList creatureAspects(int size, Aspect... aspects) {
        int sizeMod = Math.max(Math.round((float) size / (float) aspects.length), 1);
        AspectList result = new AspectList().add(Aspect.BEAST, size);
        for (Aspect aspect : aspects) result.add(aspect, sizeMod);
        return result;
    }

    public static AspectList bossAspects(int amount, Aspect... aspects) {
        AspectList result = new AspectList().add(Aspect.EARTH, amount).add(Aspect.AIR, amount).add(Aspect.FIRE, amount)
                .add(Aspect.ENTROPY, amount).add(Aspect.WATER, amount).add(Aspect.ORDER, amount);

        for (Aspect aspect : aspects) result.add(aspect, amount);

        return result;
    }
}
