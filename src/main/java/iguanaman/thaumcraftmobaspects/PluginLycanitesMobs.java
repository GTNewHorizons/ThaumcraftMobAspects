package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginLycanitesMobs implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[] { "LycanitesMobs" };
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<ThaumcraftEntity>();
        // DEMON
        mobs.add(
                new ThaumcraftEntity(
                        "Asmodi",
                        new AspectList().add(Aspect.METAL, 3).add(Aspect.MECHANISM, 2).add(Aspect.MIND, 1)
                                .add(Aspect.ENTROPY, 1)));
        mobs.add(new ThaumcraftEntity("Behemoth", creatureAspects(4, Aspect.FIRE).add(Aspect.ENTROPY, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "Belph",
                        new AspectList().add(Aspect.FIRE, 2).add(Aspect.MAGIC, 1).add(Aspect.ENTROPY, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "Cacodemon",
                        new AspectList().add(Aspect.FLIGHT, 3).add(Aspect.AIR, 3).add(Aspect.ENERGY, 2)
                                .add(Aspect.ENTROPY, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "NetherSoul",
                        new AspectList().add(Aspect.FLIGHT, 2).add(Aspect.AIR, 2).add(Aspect.FIRE, 2)
                                .add(Aspect.ENERGY, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "Pinky",
                        new AspectList().add(Aspect.HUNGER, 2).add(Aspect.FLESH, 2).add(Aspect.GREED, 2)));
        mobs.add(new ThaumcraftEntity("Trite", creatureAspects(2, Aspect.ENTROPY)));

        // DESERT
        mobs.add(
                new ThaumcraftEntity(
                        "CryptZombie",
                        new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1)
                                .add(Aspect.CLOTH, 1)));

        // SWAMP
        mobs.add(
                new ThaumcraftEntity(
                        "GhoulZombie",
                        new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1)
                                .add(Aspect.POISON, 1)));

        return mobs;
    }

    public static AspectList creatureAspects(int size, Aspect... aspects) {
        return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }
}
