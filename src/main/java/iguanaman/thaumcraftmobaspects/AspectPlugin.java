package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

public interface AspectPlugin {

    public String[] getRequiredMods();

    public HashSet<ThaumcraftEntity> getThaumcraftMobs();
}
