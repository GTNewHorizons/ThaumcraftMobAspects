package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginTwilightForest implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[] { "TwilightForest" };
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<ThaumcraftEntity>();
        mobs.add(new ThaumcraftEntity("TwilightForest.Bighorn Sheep", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Block&Chain Goblin",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1)));
        // mobs.add(new ThaumcraftMob("TwilightForest.Boggard", );
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Death Tome",
                        new AspectList().add(Aspect.MIND, 3).add(Aspect.SOUL, 2).add(Aspect.TRAP, 1)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Fire Beetle", creatureAspects(2, Aspect.FIRE)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Firefly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Forest Bunny", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Forest Raven", creatureAspects(2, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Forest Squirrel", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Hedge Spider",
                        new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Helmet Crab", creatureAspects(2, Aspect.EARTH, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Hostile Wolf", creatureAspects(3, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Hydra", bossAspects(7, Aspect.ARMOR, Aspect.GREED)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.HydraHead",
                        bossAspects(7, Aspect.WEAPON, Aspect.ENERGY, Aspect.MIND)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.King Spider",
                        new AspectList().add(Aspect.BEAST, 6).add(Aspect.ENTROPY, 4)));
        // mobs.add(new ThaumcraftMob("TwilightForest.Knight Phantom", );
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Lich Minion",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Lower Goblin Knight",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Loyal Zombie",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Maze Slime",
                        new AspectList().add(Aspect.SLIME, 2).add(Aspect.WATER, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Mini Ghast",
                        new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Minoshroom",
                        bossAspects(6, Aspect.MAN, Aspect.BEAST, Aspect.PLANT, Aspect.GREED, Aspect.DARKNESS)
                                .add(Aspect.WEAPON, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Minotaur",
                        creatureAspects(3, Aspect.EARTH).add(Aspect.WEAPON, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Mist Wolf",
                        creatureAspects(3, Aspect.EARTH).add(Aspect.DARKNESS, 2)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Mosquito Swarm", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Naga", bossAspects(7, Aspect.BEAST, Aspect.POISON)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Penguin", creatureAspects(3, Aspect.COLD).add(Aspect.WATER, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Pinch Beetle",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Questing Ram",
                        creatureAspects(4, Aspect.EARTH).add(Aspect.CLOTH, 4)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Redcap", creatureAspects(2, Aspect.EARTH).add(Aspect.METAL, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Redcap Sapper",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.METAL, 1)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Redscale Broodling", creatureAspects(1, Aspect.ENTROPY)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Skeleton Druid",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 1)
                                .add(Aspect.POISON, 1).add(Aspect.MAGIC, 1)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Slime Beetle", creatureAspects(2, Aspect.SLIME)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Swarm Spider", creatureAspects(1, Aspect.ENTROPY)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Tiny Bird", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Tower Boss",
                        bossAspects(10, Aspect.UNDEAD, Aspect.FLIGHT, Aspect.ENTROPY)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Tower Ghast",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.FIRE, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Tower Golem",
                        new AspectList().add(Aspect.METAL, 4).add(Aspect.EARTH, 3)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Tower Termite", creatureAspects(1, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Twilight Kobold", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Twilight Lich",
                        bossAspects(10, Aspect.UNDEAD, Aspect.MAGIC, Aspect.MIND)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Twilight Wraith",
                        new AspectList().add(Aspect.SOUL, 3).add(Aspect.GREED, 3).add(Aspect.DARKNESS, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Upper Goblin Knight",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "TwilightForest.Wild Boar",
                        creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1)));
        mobs.add(new ThaumcraftEntity("TwilightForest.Wild Deer", creatureAspects(2, Aspect.EARTH)));
        return mobs;
    }

    public static AspectList creatureAspects(int size, Aspect... aspects) {
        return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }

    public static AspectList bossAspects(int amount, Aspect... aspects) {
        return ThaumcraftMobAspects.bossAspects(amount, aspects);
    }
}
