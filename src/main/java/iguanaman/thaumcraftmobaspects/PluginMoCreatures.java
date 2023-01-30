package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginMoCreatures implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[] { "MoCreatures" };
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<ThaumcraftEntity>();
        mobs.add(new ThaumcraftEntity("MoCreatures.Ant", creatureAspects(1, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Ant", creatureAspects(1, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Bear", creatureAspects(3, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Bee", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("MoCreatures.BigCat", creatureAspects(3, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.BigGolem",
                        new AspectList().add(Aspect.METAL, 4).add(Aspect.MECHANISM, 2).add(Aspect.GREED, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Bird", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Boar", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Bunny", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.ButterFly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Crab", creatureAspects(2, Aspect.EARTH, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Cricket", creatureAspects(1, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Crocodile", creatureAspects(3, Aspect.WATER, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Deer", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Dolphin", creatureAspects(3, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.DragonFly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Duck", creatureAspects(2, Aspect.EARTH, Aspect.FLIGHT)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Egg",
                        new AspectList().add(Aspect.PLANT, 1).add(Aspect.LIFE, 1).add(Aspect.BEAST, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Elephant", creatureAspects(4, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Firefly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Fishbowl",
                        new AspectList().add(Aspect.WATER, 1).add(Aspect.CRYSTAL, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Fishy", creatureAspects(1, Aspect.WATER)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.FlameWraith",
                        new AspectList().add(Aspect.SOUL, 3).add(Aspect.FIRE, 3)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Fly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Fox", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Goat", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity("MoCreatures.HellRat", new AspectList().add(Aspect.BEAST, 2).add(Aspect.FIRE, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.HorseMob",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.EARTH, 1).add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.JellyFish", creatureAspects(2, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Kitty", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.KittyBed",
                        new AspectList().add(Aspect.CLOTH, 1).add(Aspect.TREE, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.KomodoDragon",
                        new AspectList().add(Aspect.BEAST, 3).add(Aspect.POISON, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.LitterBox",
                        new AspectList().add(Aspect.EARTH, 1).add(Aspect.TREE, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Maggot", creatureAspects(1, Aspect.EARTH, Aspect.ENTROPY)));
        mobs.add(new ThaumcraftEntity("MoCreatures.MediumFish", creatureAspects(2, Aspect.WATER)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.MiniGolem",
                        new AspectList().add(Aspect.METAL, 2).add(Aspect.MECHANISM, 1).add(Aspect.GREED, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Mouse", creatureAspects(1, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Ogre",
                        new AspectList().add(Aspect.BEAST, 4).add(Aspect.DARKNESS, 3)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Ostrich", creatureAspects(2, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.PetScorpion",
                        new AspectList().add(Aspect.BEAST, 3).add(Aspect.WEAPON, 1).add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Piranha", creatureAspects(1, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Raccoon", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Rat", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Ray", creatureAspects(2, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Roach", creatureAspects(1, Aspect.EARTH, Aspect.ENTROPY)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Scorpion",
                        new AspectList().add(Aspect.BEAST, 3).add(Aspect.WEAPON, 1).add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Shark", creatureAspects(3, Aspect.WATER)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.SilverSkeleton",
                        new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.METAL, 1).add(Aspect.ARMOR, 1)));
        mobs.add(new ThaumcraftEntity("MoCreatures.SmallFish", creatureAspects(1, Aspect.WATER)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Snail", creatureAspects(1, Aspect.SLIME)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Snake", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Turkey", creatureAspects(2, Aspect.FLIGHT, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.Turtle", creatureAspects(2, Aspect.EARTH)));
        mobs.add(new ThaumcraftEntity("MoCreatures.WWolf", creatureAspects(3, Aspect.EARTH)));
        mobs.add(
                new ThaumcraftEntity("MoCreatures.Werewolf", new AspectList().add(Aspect.BEAST, 3).add(Aspect.MAN, 3)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.WildHorse",
                        new AspectList().add(Aspect.BEAST, 4).add(Aspect.EARTH, 1).add(Aspect.AIR, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Wraith",
                        new AspectList().add(Aspect.SOUL, 3).add(Aspect.ENTROPY, 3)));
        mobs.add(
                new ThaumcraftEntity(
                        "MoCreatures.Wyvern",
                        new AspectList().add(Aspect.BEAST, 5).add(Aspect.FLIGHT, 3).add(Aspect.AIR, 3)));
        return mobs;
    }

    public static AspectList creatureAspects(int size, Aspect... aspects) {
        return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }

}
