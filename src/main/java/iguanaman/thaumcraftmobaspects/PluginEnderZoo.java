package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginEnderZoo implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[] { "EnderZoo" };
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<>();

        mobs.add(new ThaumcraftEntity("enderzoo.DireWolf", new AspectList().add(Aspect.EARTH, 3).add(Aspect.BEAST, 3)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.WitherWitch",
                        new AspectList().add(Aspect.MAN, 3).add(Aspect.POISON, 1).add(Aspect.MAGIC, 2)
                                .add(Aspect.DEATH, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.Enderminy",
                        new AspectList().add(Aspect.ELDRITCH, 2).add(Aspect.AIR, 1).add(Aspect.TRAVEL, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.FallenKnight",
                        new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.ARMOR, 1)
                                .add(Aspect.ORDER, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.FallenMount",
                        new AspectList().add(Aspect.BEAST, 4).add(Aspect.EARTH, 1).add(Aspect.UNDEAD, 2)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.WitherCat",
                        new AspectList().add(Aspect.BEAST, 1).add(Aspect.MIND, 1).add(Aspect.MOTION, 2)
                                .add(Aspect.SENSES, 2).add(Aspect.DEATH, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "enderzoo.ConcussionCreeper",
                        new AspectList().add(Aspect.PLANT, 2).add(Aspect.FIRE, 2).add(Aspect.TRAVEL, 2)));
        mobs.add(new ThaumcraftEntity("enderzoo.DireSlime", new AspectList().add(Aspect.EARTH, 2).add(Aspect.LIFE, 1)));

        return mobs;
    }
}
