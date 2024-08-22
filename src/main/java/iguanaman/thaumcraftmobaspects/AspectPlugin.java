package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

public interface AspectPlugin {

    String[] getRequiredMods();

    HashSet<ThaumcraftEntity> getThaumcraftMobs();
}
