package me.swirtzly.angels.config;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;

public class WAConfig {
	public static final WAConfig CONFIG;
	public static final ForgeConfigSpec CONFIG_SPEC;
	
	static {
		final Pair<WAConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(WAConfig::new);
		CONFIG = specPair.getLeft();
		CONFIG_SPEC = specPair.getRight();
	}
	
	//WorldGen
	public final ForgeConfigSpec.BooleanValue arms;
	public final ForgeConfigSpec.BooleanValue catacombs;
	public final ForgeConfigSpec.IntValue chanceCatacombs;
	public final ForgeConfigSpec.BooleanValue genOres;
	//Spawn
	public final ForgeConfigSpec.IntValue maxSpawn;
	public final ForgeConfigSpec.IntValue spawnProbability;
	public final ForgeConfigSpec.IntValue minSpawn;
	public final ForgeConfigSpec.ConfigValue<String> spawnType;
	public final ForgeConfigSpec.ConfigValue<List<? extends String>> notAllowedBiomes;
	//Angel
	public final ForgeConfigSpec.BooleanValue hardcoreMode;
	public final ForgeConfigSpec.BooleanValue updateChecker;
    public final ForgeConfigSpec.BooleanValue playScrapeSounds;
	public final ForgeConfigSpec.BooleanValue playSeenSounds;
	public final ForgeConfigSpec.DoubleValue damage;
	public final ForgeConfigSpec.IntValue xpGained;
	public final ForgeConfigSpec.BooleanValue blockBreaking;
	public final ForgeConfigSpec.IntValue blockBreakRange;
	public final ForgeConfigSpec.BooleanValue chickenGoboom;
	public final ForgeConfigSpec.BooleanValue torchBlowOut;
	public final ForgeConfigSpec.ConfigValue<List<? extends String>> disAllowedBlocks;
	public final ForgeConfigSpec.BooleanValue freezeOnAngel;
	public final ForgeConfigSpec.BooleanValue pickaxeOnly;
	public final ForgeConfigSpec.IntValue stalkRange;
	public final ForgeConfigSpec.DoubleValue moveSpeed;
	public final ConfigValue<List<? extends String>> transparent_blocks;
	
	//Teleport
	public final ForgeConfigSpec.ConfigValue<String> teleportType;
    public final ForgeConfigSpec.ConfigValue<List<? extends String>> notAllowedDimensions;
	public final ForgeConfigSpec.BooleanValue justTeleport;
	public final ForgeConfigSpec.IntValue teleportRange;
	public final ForgeConfigSpec.BooleanValue angelDimTeleport;
	
	public WAConfig(ForgeConfigSpec.Builder builder) {
		builder.push("world_gen");
		arms = builder
				.translation("config.weeping_angels.gen_arms")
				.comment("Config to toggle the generation of arms in snow biomes")
				.define("arms", true);
		catacombs = builder
				.translation("config.weeping_angels.genCatacombs")
				.comment("Generate catacombs?")
				.define("genCatacombs", false);
		chanceCatacombs = builder
				.translation("config.weeping_angels.chanceGenCatacombs")
				.comment("Chance to generate catacombs? 1 chance of ... (default :25)")
				.defineInRange("chanceCatacombs", 25, 1, Integer.MAX_VALUE);
		genOres = builder
				.translation("config.weeping_angels.genOre")
				.comment("Configure whether the mods ores spawn. This MAY require a restart when changed.")
				.define("genOres", true);
		builder.pop();
		builder.push("spawn");
		minSpawn = builder
				.translation("config.weeping_angels.min_spawn")
				.comment("The minimum amount of angels per biome")
				.defineInRange("minimumSpawn", 2, 1, 24);
		maxSpawn = builder
				.translation("config.weeping_angels.max_spawn")
				.comment("The maximum amount of angels per biome")
				.defineInRange("maximumSpawn", 4, 1, 25);
		spawnProbability = builder
				.translation("config.weeping_angels.spawn_probability")
				.comment("The angel spawn probability rate")
				.defineInRange("spawnProbability", 15, 1, 100);
		spawnType = builder
				.translation("config.weeping_angels.spawntype")
                .comment("This will only accept: MONSTER || CREATURE || AMBIENT || WATER_CREATURE || MISC || Anything else WILL crash your game.")
				.worldRestart()
                .define("spawnType", "MONSTER");
		notAllowedBiomes = builder
				.translation("config.weeping_angels.disallowed_spawn_biomes")
				.comment("Note: A list of biomes where angels should NOT spawn.")
				.defineList("notAllowedBiomes", Lists.newArrayList("minecraft:void", "minecraft:nether", "minecraft:the_end","minecraft:deep_ocean", "minecraft:ocean"), String.class::isInstance);
		builder.pop();
		builder.push("angel");
		hardcoreMode = builder
				.translation("config.weeping_angels.hardcore")
				.comment("if enabled, No way to attack/kill angels. Just running.")
				.define("hardcoreMode", false);
		updateChecker = builder
				.translation("config.weeping_angels.update_checker")
				.comment("Config to toggle the update available checker")
				.define("enableUpdateChecker", true);
        playScrapeSounds = builder
				.translation("config.weeping_angels.angel_move_sound")
				.comment("Non-child angels play scraping sounds when moving, this toggles that")
                .define("playScrapeSound", true);
		playSeenSounds = builder
				.translation("config.weeping_angels.angel_seen_sound")
				.comment("Toggle seen sounds")
				.define("playSeenSounds", true);
		damage = builder
				.translation("config.weeping_angels.angel_damage")
				.comment("The damage dealt by an angel")
				.defineInRange("damage", 8.0D, 1.0D, Double.MAX_VALUE);
		xpGained = builder
				.translation("config.weeping_angels.angel_xp_value")
				.comment("XP gained from angels")
				.defineInRange("xpGained", 25, 1, Integer.MAX_VALUE);
		chickenGoboom = builder
				.translation("config.weeping_angels.chicken_go_boom")
				.comment("If this is enabled, the timey wimey detector can blow up chickens when in use randomly")
				.define("chickenGoboom", true);
		torchBlowOut = builder
				.translation("config.weeping_angels.blowout_torch")
				.comment("If this is enabled, baby angels will blow out light items from the players hand")
				.define("torchBlowOut", true);
		freezeOnAngel = builder
				.translation("config.weeping_angels.ql")
				.comment("if enabled, angels will freeze when they see one another.")
				.define("freezeOnAngel", false);
		pickaxeOnly = builder
				.translation("config.weeping_angels.pickaxe_only")
				.comment("if enabled, Only pickaxes and generators will work on the angels")
				.define("pickaxeOnly", true);
		stalkRange = builder
				.translation("config.weeping_angels.around_player_range")
				.comment("Determines the range the angels will look for players within, personally, I'd stay under 100")
				.defineInRange("stalkRange", 65, 1, 100);
		moveSpeed = builder
				.translation("config.weeping_angels.moveSpeed")
				.comment("Determines the angels move speed")
				.defineInRange("moveSpeed", 1.5, 1.0, Double.MAX_VALUE);
		blockBreaking = builder
				.translation("config.weeping_angels.angel.block_break")
				.comment("If this is enabled, angels will break blocks (If gamerules allow)")
				.define("blockBreaking", true);
		disAllowedBlocks = builder
				.translation("config.weeping_angels.disallowed_blocks") //new String[]{"thedalekmod:tardis", "tardis:tardis", "tardis:tardisblocktop", "minecraft:air"})
				.defineList("disAllowedBlocks", Lists.newArrayList("minecraft:magma_block","minecraft:glowstone","minecraft:sea_lantern","tardis:exterior_steampunk","tardis:exterior_clock", "minecraft:air"),String.class::isInstance);
				//TODO: Add disallowed block registry names for Dalek Mod and Tardis Mod 1.13+ when that releases
		blockBreakRange = builder
				.translation("config.weeping_angels.block_break_range")
				.comment("The maximum range a angel can break blocks within")
				.defineInRange("blockBreakRange", 25, 1, Integer.MAX_VALUE);
		transparent_blocks = builder
				.translation("config.weeping_angels.transparent_blocks")
				.comment("List of blocks that you should be able to see angels through.","Format for entries: ModID:BlockRegistryName")
				.defineList("transparentBlocks", Lists::newArrayList, String.class::isInstance);
		builder.pop();
		builder.push("teleport");
		teleportType = builder
				.translation("config.weeping_angels.teleport_enabled")
				.comment("Teleport type, Acceptable entries: RANDOM_PLACE, DONT, STRUCTURES")
				.defineInList("teleportType", "RANDOM_PLACE", Arrays.asList("RANDOM_PLACE", "DONT", "STRUCTURES"));
		notAllowedDimensions = builder
				.translation("config.weeping_angels.disallowed_dimensions")
				.comment("Note: This a list of dimensions that angels should NOT teleport you to.")
                .defineList("notAllowedDimensions", Lists.newArrayList("minecraft:the_end"), String.class::isInstance);
		justTeleport = builder
				.translation("config.weeping_angels.teleport_instant")
				.comment("just teleport. no damage.")
				.define("justTeleport", false);
		teleportRange = builder
				.translation("config.weeping_angels.teleportRange")
				.comment("The maximum range a user can be teleported by the Angels")
				.defineInRange("teleportRange", 450, 1, Integer.MAX_VALUE);
		angelDimTeleport = builder
				.translation("config.weeping_angels.angeldimteleport")
				.comment("If this is enabled, angel teleporting can also tp the player to other dimensions")
				.define("angelDimTeleport", true);
		builder.pop();
	}
	
	//TODO : Getters
}
