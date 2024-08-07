package iguanaman.thaumcraftmobaspects;

import java.util.HashSet;

import com.dreammaster.modfixes.GTpp.GregTechPlusPlusAbandonedAspectsFix;

import fox.spiteful.forbidden.DarkAspects;
import gregtech.api.enums.TC_Aspects;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginSpecialMobs implements AspectPlugin {

    @Override
    public String[] getRequiredMods() {
        return new String[]{"SpecialMobs"};
    }

    @Override
    public HashSet<ThaumcraftEntity> getThaumcraftMobs() {
        HashSet<ThaumcraftEntity> mobs = new HashSet<>();

        // CREEPERS
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
        mobs.add(new ThaumcraftEntity("SpecialMobs.GravelCreeper", creeperAspects.copy().add(Aspect.EARTH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GravityCreeper", creeperAspects.copy().add((Aspect) TC_Aspects.MAGNETO.mAspect, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.JumpingCreeper", creeperAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.LightningCreeper", creeperAspects.copy().add(Aspect.WEATHER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MiniCreeper", new AspectList().add(Aspect.PLANT, 1).add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SplittingCreeper", creeperAspects.copy().add(Aspect.EXCHANGE, 1)));

        // ENDERMEN
        AspectList endermanAspects = new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.AIR, 2).add(Aspect.TRAVEL, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialEnderman", endermanAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BlindingEnderman", endermanAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.CursedEnderman", endermanAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.IcyEnderman", endermanAspects.copy().add(Aspect.COLD, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.LightningEnderman", endermanAspects.copy().add(Aspect.WEATHER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MiniEnderman", new AspectList().add(Aspect.ELDRITCH, 2).add(Aspect.AIR, 1).add(Aspect.TRAVEL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MirageEnderman", endermanAspects.copy().add((Aspect) GregTechPlusPlusAbandonedAspectsFix.CUSTOMASPECTCOMPAT[1], 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ThiefEnderman", endermanAspects.copy().add(Aspect.GREED, 1)));

        // GHASTS
        AspectList ghastAspects = new AspectList().add(Aspect.SOUL, 2).add(Aspect.FIRE, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialGhast", ghastAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BabyGhast", new AspectList().add(Aspect.SOUL, 1).add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FaintGhast", ghastAspects.copy().add(Aspect.AIR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FighterGhast", ghastAspects.copy().add(Aspect.WEAPON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.KingGhast", ghastAspects.copy().add(Aspect.SOUL, 1).add(Aspect.FIRE, 1).add((Aspect) GregTechPlusPlusAbandonedAspectsFix.CUSTOMASPECTCOMPAT[4], 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MiniGhast", new AspectList().add(Aspect.SOUL, 1).add(Aspect.FIRE, 1).add((Aspect) TC_Aspects.MAGNETO.mAspect, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.QueenGhast", ghastAspects.copy().add(Aspect.SOUL, 1).add(Aspect.FIRE, 1).add(DarkAspects.LUST, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.UnholyGhast", ghastAspects.copy().add(Aspect.HEAL, 1)));

        // SKELETONS
        AspectList skeletonAspects = new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSkeleton", skeletonAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BrutishSkeleton", skeletonAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FireSkeleton", skeletonAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GatlingSkeleton", skeletonAspects.copy().add(Aspect.MECHANISM, 1).add(Aspect.MOTION, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GiantSkeleton", skeletonAspects.copy().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.NinjaSkeleton", skeletonAspects.copy().add(Aspect.EXCHANGE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSkeleton", skeletonAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SniperSkeleton", skeletonAspects.copy().add(Aspect.SENSES, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpitfireSkeleton", skeletonAspects.copy().add(Aspect.FIRE, 1).add(DarkAspects.NETHER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ThiefSkeleton", skeletonAspects.copy().add(Aspect.GREED, 1)));

        // SPIDERS
        AspectList spiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSpider", spiderAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BabySpider", new AspectList().add(Aspect.BEAST, 1).add(Aspect.ENTROPY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DesertSpider", spiderAspects.copy().add(Aspect.EARTH, 1).add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingSpider", spiderAspects.copy().add(Aspect.FLIGHT, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GhostSpider", spiderAspects.copy().add(Aspect.SOUL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GiantSpider", new AspectList().add(Aspect.BEAST, 4).add(Aspect.ENTROPY, 3)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungrySpider", spiderAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MotherSpider", spiderAspects.copy().add(DarkAspects.LUST, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PaleSpider", spiderAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSpider", spiderAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SmallSpider", new AspectList().add(Aspect.BEAST, 2).add(Aspect.ENTROPY, 1).add(Aspect.MOTION, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughSpider", spiderAspects.copy().add(Aspect.LIFE, 1).add(Aspect.ARMOR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WebSpider", spiderAspects.copy().add(Aspect.TRAP, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WitchSpider", spiderAspects.copy().add((Aspect) TC_Aspects.NEBRISUM.mAspect, 1)));

        // CAVE SPIDERS
        AspectList caveSpiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2).add(Aspect.POISON, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialCaveSpider", caveSpiderAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BabyCaveSpider", new AspectList().add(Aspect.BEAST, 2).add(Aspect.ENTROPY, 1).add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingCaveSpider", caveSpiderAspects.copy().add(Aspect.FLIGHT, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.MotherCaveSpider", caveSpiderAspects.copy().add(DarkAspects.LUST, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughCaveSpider", caveSpiderAspects.copy().add(Aspect.LIFE, 1).add(Aspect.ARMOR, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WebCaveSpider", caveSpiderAspects.copy().add(Aspect.TRAP, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WitchCaveSpider", caveSpiderAspects.copy().add((Aspect) TC_Aspects.NEBRISUM.mAspect, 1)));

        // ZOMBIES
        AspectList zombieAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialZombie", zombieAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BrutishZombie", zombieAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FireZombie", zombieAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingZombie", zombieAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GiantZombie", new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.MAN, 2).add(Aspect.EARTH, 2)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungryZombie", zombieAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PlagueZombie", zombieAspects.copy().add(Aspect.POISON, 1)));

        // PIG ZOMBIES
        AspectList pigZombieAspects = new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.FIRE, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialPigZombie", pigZombieAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BrutishPigZombie", pigZombieAspects.copy().add(Aspect.ENERGY, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingPigZombie", pigZombieAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.GiantPigZombie", new AspectList().add(Aspect.UNDEAD, 6).add(Aspect.FIRE, 3)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HungryPigZombie", pigZombieAspects.copy().add(Aspect.HUNGER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PlaguePigZombie", pigZombieAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.VampirePigZombie", pigZombieAspects.copy().add(Aspect.HEAL, 1).add(Aspect.HUNGER, 1)));

        // SILVERFISHES
        AspectList silverfishAspects = new AspectList().add(Aspect.WATER, 2).add(Aspect.BEAST, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSilverfish", silverfishAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BlindingSilverfish", silverfishAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FishingSilverfish", silverfishAspects.copy().add(Aspect.TOOL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.FlyingSilverfish", silverfishAspects.copy().add(Aspect.FLIGHT, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.PoisonSilverfish", silverfishAspects.copy().add(Aspect.POISON, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ToughSilverfish", silverfishAspects.copy().add(Aspect.LIFE, 1).add(Aspect.ARMOR, 1)));

        // WITCHES
        AspectList witchAspects = new AspectList().add(Aspect.MAN, 3).add(Aspect.POISON, 1).add(Aspect.MAGIC, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialWitch", witchAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.DominationWitch", witchAspects.copy().add(Aspect.DEATH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.RageWitch", witchAspects.copy().add(DarkAspects.WRATH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ShadowsWitch", witchAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.UndeadWitch", witchAspects.copy().add(Aspect.UNDEAD, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WildsWitch", witchAspects.copy().add(Aspect.BEAST, 1).add(Aspect.LIFE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WindWitch", witchAspects.copy().add(Aspect.MOTION, 1).add(Aspect.SOUL, 1).add(Aspect.TRAVEL, 1)));

        // BLAZES
        AspectList blazeAspects = new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.FIRE, 1);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialBlaze", blazeAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.CinderBlaze", new AspectList().add(Aspect.ELDRITCH, 2).add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.ConflagrationBlaze", blazeAspects.copy().add(DarkAspects.NETHER, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.EmberBlaze", blazeAspects.copy().add((Aspect) TC_Aspects.STRONTIO.mAspect, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.HellfireBlaze", blazeAspects.copy().add(Aspect.FIRE, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.InfernoBlaze", blazeAspects.copy().add(DarkAspects.WRATH, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.JoltBlaze", blazeAspects.copy().add(Aspect.WEATHER, 1).add(Aspect.TRAVEL, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.SmolderBlaze", blazeAspects.copy().add(Aspect.DARKNESS, 1)));
        mobs.add(new ThaumcraftEntity("SpecialMobs.WildfireBlaze", blazeAspects.copy().add(DarkAspects.LUST, 1)));

        // SLIMES
        AspectList slimeAspects = new AspectList().add(Aspect.WATER, 2).add(Aspect.SLIME, 2);
        mobs.add(new ThaumcraftEntity("SpecialMobs.SpecialSlime", slimeAspects));
        mobs.add(new ThaumcraftEntity("SpecialMobs.BlackberrySlime", slimeAspects.copy().add(Aspect.ENERGY, 1))); // detonates on targets
        mobs.add(new ThaumcraftEntity("SpecialMobs.BlueberrySlime", slimeAspects.copy().add(Aspect.WATER, 1))); // moves freely in water, immune to drowning
        mobs.add(new ThaumcraftEntity("SpecialMobs.CaramelSlime", slimeAspects.copy().add((Aspect) TC_Aspects.MAGNETO.mAspect, 1))); // attaches to targets
        mobs.add(new ThaumcraftEntity("SpecialMobs.GrapeSlime", slimeAspects.copy().add(Aspect.FLIGHT, 1))); // increased bouncing height, immune to fall damage
        mobs.add(new ThaumcraftEntity("SpecialMobs.LemonSlime", slimeAspects.copy().add(Aspect.WEATHER, 1).add(Aspect.TRAVEL, 1))); // summons lightnings, teleports on hit
        mobs.add(new ThaumcraftEntity("SpecialMobs.StrawberrySlime", slimeAspects.copy().add(Aspect.FIRE, 1))); // ignites on hit, immune to fire
        mobs.add(new ThaumcraftEntity("SpecialMobs.WatermelonSlime", slimeAspects.copy().add(Aspect.MOTION, 1))); // lunges at targets, increased knockback

        // OTHER MOBS
        mobs.add(new ThaumcraftEntity("SpecialMobs.LavaMonster", new AspectList().add(Aspect.ELDRITCH, 2).add(Aspect.FIRE, 2).add(DarkAspects.NETHER, 1)));

        return mobs;
    }
}
