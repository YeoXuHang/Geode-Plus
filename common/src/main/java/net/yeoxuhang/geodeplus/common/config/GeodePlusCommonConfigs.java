package net.yeoxuhang.geodeplus.common.config;


import com.kyanite.paragon.api.ConfigGroup;
import com.kyanite.paragon.api.ConfigOption;
import com.kyanite.paragon.api.interfaces.Config;
import com.kyanite.paragon.api.interfaces.Description;

public class GeodePlusCommonConfigs implements Config {
    @Description("Default = false")
    public static final ConfigOption<Boolean> SHOULD_SILK_TOUCH_BUDDING_BLOCKS = new ConfigOption<>("Enable Silk Touch for budding blocks", false);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE = new ConfigOption<>("Enable Prismarine Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_DIAMOND_GEODE = new ConfigOption<>("Enable Diamond Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_EMERALD_GEODE = new ConfigOption<>("Enable Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_LAPIS_GEODE = new ConfigOption<>("Enable Lapis Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_STONE_REDSTONE_GEODE = new ConfigOption<>("Enable Redstone Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE = new ConfigOption<>("Enable Deepslate Diamond Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE = new ConfigOption<>("Enable Deepslate Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE = new ConfigOption<>("Enable Deepslate Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE = new ConfigOption<>("Enable Deepslate Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_ECHO_GEODE = new ConfigOption<>("Enable Echo Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_DIAMOND_GEODE = new ConfigOption<>("Enable Sculk Diamond Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_EMERALD_GEODE = new ConfigOption<>("Enable Sculk Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_LAPIS_GEODE = new ConfigOption<>("Enable Sculk Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_SCULK_REDSTONE_GEODE = new ConfigOption<>("Enable Sculk Emerald Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE = new ConfigOption<>("Enable Nether Ancient Debris Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE = new ConfigOption<>("Enable Nether Glowstone Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE = new ConfigOption<>("Enable Nether Gold Nugget Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_NETHER_QUARTZ_GEODE = new ConfigOption<>("Enable Nether Quartz Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE = new ConfigOption<>("Enable Basalt Ancient Debris Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE = new ConfigOption<>("Enable Basalt Glowstone Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE = new ConfigOption<>("Enable Basalt Gold Nugget Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BASALT_QUARTZ_GEODE = new ConfigOption<>("Enable Basalt Ancient Quartz Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE = new ConfigOption<>("Enable Blackstone Ancient Debris Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE = new ConfigOption<>("Enable Blackstone Glowstone Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE = new ConfigOption<>("Enable Blackstone Gold Nugget Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE = new ConfigOption<>("Enable Blackstone Quartz Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_END_WRAPPIST_GEODE = new ConfigOption<>("Enable Wrappist Geode", true);
    public static final ConfigOption<Boolean> SHOULD_GENERATE_CELESTITE_GEODE = new ConfigOption<>("Enable Celestite Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_PINK_TOPAZ_GEODE = new ConfigOption<>("Enable Pink Topaz Geode", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL = new ConfigOption<>("Enable Large Prismarine Crystal", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_ECHO_CRYSTAL = new ConfigOption<>("Enable Large Echo Crystal", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL = new ConfigOption<>("Enable Large Nether Quartz Crystal", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL = new ConfigOption<>("Enable Large Nether Glowstone Crystal", true);
    @Description("Default = true")
    public static final ConfigOption<Boolean> SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL = new ConfigOption<>("Enable Large End Wrappist Crystal", true);


    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_DEEP_OCEAN_PRISMARINE_GEODE = new ConfigOption<>("Rarity of Prismarine Geode", 32);
    @Description("Default = 16")
    public static final ConfigOption<Integer> RARITY_ECHO_GEODE = new ConfigOption<>("Rarity of Echo Geode", 16);
    @Description("Default = 48")
    public static final ConfigOption<Integer> RARITY_ORES_GEODE = new ConfigOption<>("Rarity of Ores Geode", 48);
    @Description("Default = 72")
    public static final ConfigOption<Integer> RARITY_RARE_ORES_GEODE = new ConfigOption<>("Rarity of Rare Ores Geode", 72);
    @Description("Default = 48")
    public static final ConfigOption<Integer> RARITY_SWAMP_GEODE = new ConfigOption<>("Rarity of Swamp Geode", 48);
    @Description("Default = 48")
    public static final ConfigOption<Integer> RARITY_PINK_TOPAZ_GEODE = new ConfigOption<>("Rarity of Pink Topaz Geode", 48);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_NETHER_DEBRIS_GEODE = new ConfigOption<>("Rarity of Nether Ancient Debris Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_NETHER_GLOWSTONE_GEODE = new ConfigOption<>("Rarity of Nether Glowstone Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_NETHER_GOLD_NUGGET_GEODE = new ConfigOption<>("Rarity of Nether Gold Nugget Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_NETHER_QUARTZ_GEODE = new ConfigOption<>("Rarity of Nether Quartz Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BASALT_DEBRIS_GEODE = new ConfigOption<>("Rarity of Basalt Ancient Debris Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BASALT_GLOWSTONE_GEODE = new ConfigOption<>("Rarity of Basalt Glowstone Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BASALT_GOLD_NUGGET_GEODE = new ConfigOption<>("Rarity of Basalt Gold Nugget Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BASALT_QUARTZ_GEODE = new ConfigOption<>("Rarity of Basalt Quartz Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BLACKSTONE_DEBRIS_GEODE = new ConfigOption<>("Rarity of Blackstone Ancient Debris Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BLACKSTONE_GLOWSTONE_GEODE = new ConfigOption<>("Rarity of Blackstone Glowstone Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BLACKSTONE_GOLD_NUGGET_GEODE = new ConfigOption<>("Rarity of Blackstone Nugget Geode", 32);
    @Description("Default = 32")
    public static final ConfigOption<Integer> RARITY_BLACKSTONE_QUARTZ_GEODE = new ConfigOption<>("Rarity of Blackstone Quartz Geode", 32);
    @Description("Default = 48")
    public static final ConfigOption<Integer> RARITY_END_WRAPPIST_GEODE = new ConfigOption<>("Rarity of End Wrappist Geode", 48);

    public static final ConfigGroup BLOCKS = new ConfigGroup("Blocks Config", SHOULD_SILK_TOUCH_BUDDING_BLOCKS);
    public static final ConfigGroup PINK_TOPAZ_GEODE = new ConfigGroup("Pink Topaz Geodes",
            SHOULD_GENERATE_PINK_TOPAZ_GEODE);
    public static final ConfigGroup PRISMARINE_GEODE = new ConfigGroup("Prismarine Geodes",
            SHOULD_GENERATE_DEEP_OCEAN_PRISMARINE_GEODE);

    public static final ConfigGroup ECHO_GEODE = new ConfigGroup("Echo Geode", SHOULD_GENERATE_ECHO_GEODE);
    public static final ConfigGroup LAPIS_GEODES = new ConfigGroup("Lapis Geodes", SHOULD_GENERATE_STONE_LAPIS_GEODE, SHOULD_GENERATE_DEEPSLATE_LAPIS_GEODE, SHOULD_GENERATE_SCULK_LAPIS_GEODE);
    public static final ConfigGroup REDSTONE_GEODES = new ConfigGroup("Redstone Geodes", SHOULD_GENERATE_STONE_REDSTONE_GEODE, SHOULD_GENERATE_DEEPSLATE_REDSTONE_GEODE, SHOULD_GENERATE_SCULK_REDSTONE_GEODE);
    public static final ConfigGroup EMERALD_GEODES = new ConfigGroup("Emerald Geodes", SHOULD_GENERATE_STONE_EMERALD_GEODE, SHOULD_GENERATE_DEEPSLATE_EMERALD_GEODE, SHOULD_GENERATE_SCULK_EMERALD_GEODE);
    public static final ConfigGroup DIAMOND_GEODES = new ConfigGroup("Diamond Geodes", SHOULD_GENERATE_STONE_DIAMOND_GEODE, SHOULD_GENERATE_DEEPSLATE_DIAMOND_GEODE, SHOULD_GENERATE_SCULK_DIAMOND_GEODE);

    public static final ConfigGroup NETHER_GEODES = new ConfigGroup("Nether Geodes",
            SHOULD_GENERATE_NETHER_ANCIENT_DEBRIS_GEODE ,SHOULD_GENERATE_NETHER_GLOWSTONE_GEODE, SHOULD_GENERATE_NETHER_GOLD_NUGGET_DEBRIS_GEODE, SHOULD_GENERATE_NETHER_QUARTZ_GEODE);

    public static final ConfigGroup BASALT_GEODES = new ConfigGroup("Basalt Geodes",
            SHOULD_GENERATE_BASALT_ANCIENT_DEBRIS_GEODE ,SHOULD_GENERATE_BASALT_GLOWSTONE_GEODE, SHOULD_GENERATE_BASALT_GOLD_NUGGET_DEBRIS_GEODE, SHOULD_GENERATE_BASALT_QUARTZ_GEODE);

    public static final ConfigGroup BLACKSTONE_GEODES = new ConfigGroup("Blackstone Geodes",
            SHOULD_GENERATE_BLACKSTONE_ANCIENT_DEBRIS_GEODE ,SHOULD_GENERATE_BLACKSTONE_GLOWSTONE_GEODE, SHOULD_GENERATE_BLACKSTONE_GOLD_NUGGET_DEBRIS_GEODE, SHOULD_GENERATE_BLACKSTONE_QUARTZ_GEODE);

    public static final ConfigGroup END_WRAPPIST_GEODES = new ConfigGroup("End Wrappist Geodes",
            SHOULD_GENERATE_END_WRAPPIST_GEODE);
    public static final ConfigGroup CELESTITE_GEODES = new ConfigGroup("Swamp Celestite Geodes",
            SHOULD_GENERATE_CELESTITE_GEODE);
    public static final ConfigGroup LARGE_CRYSTALS = new ConfigGroup("Large Crystals",
            SHOULD_GENERATE_LARGE_PRISMARINE_CRYSTAL ,SHOULD_GENERATE_LARGE_ECHO_CRYSTAL, SHOULD_GENERATE_LARGE_NETHER_QUARTZ_CRYSTAL, SHOULD_GENERATE_LARGE_NETHER_GLOWSTONE_CRYSTAL, SHOULD_GENERATE_LARGE_END_WRAPPIST_CRYSTAL);

    @Description("Increase the number to make your adventures harder...")
    public static final ConfigGroup RARITY_GEODE = new ConfigGroup("Rarity of Geodes",
            RARITY_DEEP_OCEAN_PRISMARINE_GEODE,
            RARITY_ECHO_GEODE,
            RARITY_ORES_GEODE,
            RARITY_RARE_ORES_GEODE,
            RARITY_SWAMP_GEODE,
            RARITY_PINK_TOPAZ_GEODE,
            RARITY_NETHER_DEBRIS_GEODE,
            RARITY_NETHER_GLOWSTONE_GEODE,
            RARITY_NETHER_GOLD_NUGGET_GEODE,
            RARITY_NETHER_QUARTZ_GEODE,
            RARITY_BASALT_DEBRIS_GEODE,
            RARITY_BASALT_GLOWSTONE_GEODE,
            RARITY_BASALT_GOLD_NUGGET_GEODE,
            RARITY_BASALT_QUARTZ_GEODE,
            RARITY_BLACKSTONE_DEBRIS_GEODE,
            RARITY_BLACKSTONE_GLOWSTONE_GEODE,
            RARITY_BLACKSTONE_GOLD_NUGGET_GEODE,
            RARITY_BLACKSTONE_QUARTZ_GEODE,
            RARITY_END_WRAPPIST_GEODE
    );
}
