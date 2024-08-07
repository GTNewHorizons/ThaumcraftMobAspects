package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginBiomesOPlenty implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[] { "BiomesOPlenty" };
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<>();

        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Rosester", new AspectList().add(Aspect.BEAST, 2).add(Aspect.FLIGHT, 2).add(Aspect.AIR, 1).add(Aspect.LIFE, 1)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.JungleSpider", new AspectList().add(Aspect.BEAST, 1).add(Aspect.ENTROPY, 1).add(Aspect.PLANT, 1)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Wasp", new AspectList().add(Aspect.BEAST, 1).add(Aspect.FLIGHT, 1).add(Aspect.ORDER, 1)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Pixie", new AspectList().add(Aspect.SOUL, 1).add(Aspect.LIGHT, 1).add(Aspect.FLIGHT, 1)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Bird", new AspectList().add(Aspect.SENSES, 1).add(Aspect.FLIGHT, 1).add(Aspect.BEAST, 1)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Glob", new AspectList().add(Aspect.EARTH, 2).add(Aspect.SLIME, 2)));
        mobs.add(new ThaumcraftEntity("BiomesOPlenty.Phantom", new AspectList().add(Aspect.SOUL, 2).add(Aspect.HUNGER, 1)));

        return mobs;
    }
}
