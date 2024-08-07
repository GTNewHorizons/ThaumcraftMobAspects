package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginSpecialMobs implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[]{"SpecialMobs"};
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<ThaumcraftEntity>();
        // CREEPER
        AspectList creeperAspects = new AspectList().add(Aspect.PLANT, 2).add(Aspect.FIRE, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialCreeper", creeperAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ArmorCreeper", creeperAspects.copy().add(Aspect.ARMOR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DarkCreeper", creeperAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DeathCreeper", creeperAspects.copy().add(Aspect.DEATH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DirtCreeper", creeperAspects.copy().add(Aspect.EARTH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DoomCreeper", creeperAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DrowningCreeper", creeperAspects.copy().add(Aspect.WATER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.EnderCreeper", creeperAspects.copy().add(Aspect.ELDRITCH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FireCreeper", creeperAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.JumpingCreeper", creeperAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.LightningCreeper", creeperAspects.copy().add(Aspect.WEATHER, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.MiniCreeper",
                        new AspectList().add(Aspect.PLANT, 1).add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SplittingCreeper", creeperAspects.copy().add(Aspect.EXCHANGE, 1)));

        // ENDERMEN
        AspectList endermanAspects = new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.AIR, 2).add(Aspect.TRAVEL, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialEnderman", endermanAspects));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.AncientEnderman", endermanAspects.copy().add(Aspect.ELDRITCH,
        // 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BlindingEnderman", endermanAspects.copy().add(Aspect.DARKNESS, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.ConfusingEnderman", endermanAspects.copy().add(Aspect.SENSES,
        // 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.CursedEnderman", endermanAspects.copy().add(Aspect.SOUL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.IcyEnderman", endermanAspects.copy().add(Aspect.COLD, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.LightningEnderman", endermanAspects.copy().add(Aspect.WEATHER, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.MiniEnderman",
                        endermanAspects.copy().remove(Aspect.ELDRITCH, 2).remove(Aspect.AIR, 1)
                                .remove(Aspect.TRAVEL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MirageEnderman", endermanAspects.copy().add(Aspect.VOID, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.StrikeEnderman", endermanAspects.copy().add(Aspect.ARMOR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ThiefEnderman", endermanAspects.copy().add(Aspect.GREED, 1)));

        // GHASTS
        AspectList ghastAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialGhast", ghastAspects));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.BabyGhast",
                        new AspectList().add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FaintGhast", ghastAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FighterGhast", ghastAspects));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.GhastMount", ghastAspects));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.KingGhast",
                        ghastAspects.copy().add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.MiniGhast",
                        new AspectList().add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.QueenGhast",
                        ghastAspects.copy().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.UnholyGhast", ghastAspects.copy().add(Aspect.DARKNESS, 1)));

        // SKELETONS
        AspectList skeletonAspects = new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSkeleton", skeletonAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BrutishSkeleton", skeletonAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FireSkeleton", skeletonAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GatlingSkeleton", skeletonAspects.copy().add(Aspect.MECHANISM, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.GiantSkeleton",
                        skeletonAspects.copy().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSkeleton", skeletonAspects.copy().add(Aspect.POISON, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.QuickSkeleton", skeletonAspects.copy().add(Aspect.MOTION, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SniperSkeleton", skeletonAspects.copy().add(Aspect.SENSES, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpitfireSkeleton", skeletonAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ThiefSkeleton", skeletonAspects.copy().add(Aspect.GREED, 1)));

        // SPIDERS
        AspectList spiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSpider", spiderAspects));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.AngrySpider", spiderAspects.copy().add(Aspect.ENTROPY, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.ArmorSpider", spiderAspects.copy().add(Aspect.ARMOR, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.BabySpider",
                        new AspectList().add(Aspect.BEAST, 1).add(Aspect.ENTROPY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DesertSpider", spiderAspects.copy().add(Aspect.EARTH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingSpider", spiderAspects.copy().add(Aspect.FLIGHT, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GhostSpider", spiderAspects.copy().add(Aspect.SOUL, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.GiantSpider",
                        new AspectList().add(Aspect.BEAST, 4).add(Aspect.ENTROPY, 3)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungrySpider", spiderAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MotherSpider", spiderAspects.copy().add(Aspect.HEAL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PaleSpider", spiderAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSpider", spiderAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.SmallSpider",
                        new AspectList().add(Aspect.BEAST, 2).add(Aspect.ENTROPY, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.SpeedySpider", spiderAspects.copy().add(Aspect.MOTION, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughSpider", spiderAspects.copy().add(Aspect.LIFE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WebSpider", spiderAspects.copy().add(Aspect.TRAP, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WitchSpider", spiderAspects.copy().add(Aspect.MAGIC, 1)));

        // CAVESPIDERS
        AspectList caveSpiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2)
                .add(Aspect.POISON, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialCaveSpider", caveSpiderAspects));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.BabyCaveSpider",
                        caveSpiderAspects.copy().remove(Aspect.BEAST, 1).remove(Aspect.ENTROPY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingCaveSpider", caveSpiderAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MotherCaveSpider", caveSpiderAspects.copy().add(Aspect.HEAL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughCaveSpider", caveSpiderAspects.copy().add(Aspect.LIFE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WebCaveSpider", caveSpiderAspects.copy().add(Aspect.TRAP, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WitchCaveSpider", caveSpiderAspects.copy().add(Aspect.MAGIC, 1)));

        // ZOMBIES
        AspectList zombieAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialZombie", zombieAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BrutishZombie", zombieAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FireZombie", zombieAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingZombie", zombieAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.GiantZombie",
                        new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungryZombie", zombieAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PlagueZombie", zombieAspects.copy().add(Aspect.POISON, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.SteveZombie", zombieAspects.copy().add(Aspect.MAN, 1)));

        // ZOMBIE PIGMEN
        AspectList zombiePigmanAspects = new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.FIRE, 2);
        // mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialZombiePigman", zombiePigmanAspects));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.AngryZombiePigman", zombiePigmanAspects.copy().add(Aspect.ENTROPY,
        // 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.ChargingZombiePigman",
        // zombiePigmanAspects.copy().add(Aspect.ENERGY, 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.FishingZombiePigman", zombiePigmanAspects.copy().add(Aspect.TOOL,
        // 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.GiantZombiePigman", new AspectList().add(Aspect.UNDEAD,
        // 6).add(Aspect.FIRE, 3)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.HungryZombiePigman", zombiePigmanAspects.copy().add(Aspect.HUNGER,
        // 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.JumpingZombiePigman", zombiePigmanAspects.copy().add(Aspect.AIR,
        // 1)));
        // mobs.add(new ThaumcraftEntity("SpecialMobs.PlagueZombiePigman", zombiePigmanAspects.copy().add(Aspect.POISON,
        // 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialPigZombie", zombiePigmanAspects));
        mobs.add(
                new ThaumcraftEntity("SpecialMobs.BrutishPigZombie", zombiePigmanAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingPigZombie", zombiePigmanAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.GiantPigZombie",
                        new AspectList().add(Aspect.UNDEAD, 6).add(Aspect.FIRE, 3)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungryPigZombie", zombiePigmanAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PlaguePigZombie", zombiePigmanAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.VampirePigZombie", zombiePigmanAspects.copy().add(Aspect.HEAL, 1)));

        // SILVERFISH
        AspectList silverfishAspects = new AspectList().add(Aspect.WATER, 2).add(Aspect.BEAST, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSilverfish", silverfishAspects));
        mobs.add(
                new ThaumcraftEntity(
                        "SpecialMobs.BlindingSilverfish",
                        silverfishAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingSilverfish", silverfishAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingSilverfish", silverfishAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSilverfish", silverfishAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughSilverfish", silverfishAspects.copy().add(Aspect.LIFE, 1)));

        return mobs;
    }
}
