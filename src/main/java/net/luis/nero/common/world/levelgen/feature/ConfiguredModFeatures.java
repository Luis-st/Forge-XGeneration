package net.luis.nero.common.world.levelgen.feature;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

// TODO: fix
public class ConfiguredModFeatures {
	
//	private static final RuleTest DEEPSLATE = OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES;
//	private static final RuleTest STONE = OreConfiguration.Predicates.NATURAL_STONE;
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_COAL_ORE = register("overworld_coal_ore",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.COAL_ORE, 17))
//			.range(triangle(0, 128, 0))
//			.squared().count(20));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_COPPER_ORE = register("overworld_copper_ore",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.COPPER_ORE, 10))
//			.range(triangle(0, 96, 0))
//			.squared().count(20));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_COPPER_ORE_BLOBS = register("overworld_copper_ore_blobs",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.COPPER_ORE, 6))
//			.rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)).squared().count(10));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_IRON_ORE = register("overworld_iron_ore",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.IRON_ORE, 9))
//			.range(triangle(0, 64, 0))
//			.squared().count(20));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_IRON_ORE_BLOBS = register("overworld_iron_ore_blobs",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.IRON_ORE, 5))
//			.rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)).squared().count(5));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_GOLD_ORE = register("overworld_gold_ore",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.GOLD_ORE, 7))
//			.range(triangle(0, 48, 0))
//			.squared().count(4));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_EMERALD_ORE = register("overworld_emerald_ore",
//			ModFeatures.ORE.get().configured(new OreConfiguration(STONE, BlockStates.EMERALD_ORE, 8))
//			.rangeUniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192)).squared().count(20));
//
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_TUFF_ORE = register("overworld_tuff_ore", 
//			ModFeatures.ORE.get().configured(new OreConfiguration(DEEPSLATE, BlockStates.TUFF_ORE, 35))
//			.rangeUniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(512)).squared().count(16));
//
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_MONSTER_ROOM = register("overworld_monster_room",
//			ModFeatures.MONSTER_ROOM.get().configured(FeatureConfiguration.NONE)
//			.rangeUniform(VerticalAnchor.absolute(12), VerticalAnchor.absolute(500)).squared().count(15));
//	
//	@NotTested public static final ConfiguredFeature<?, ?> OVERWORLD_AMETHYST_GEODE = register("overworld_amethyst_geode", 
//			Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(new SimpleStateProvider(BlockStates.AIR), new SimpleStateProvider(BlockStates.AMETHYST_BLOCK), 
//			new SimpleStateProvider(BlockStates.BUDDING_AMETHYST), new SimpleStateProvider(BlockStates.CALCITE), new SimpleStateProvider(BlockStates.SMOOTH_BASALT),
//			ImmutableList.of(Blocks.SMALL_AMETHYST_BUD.defaultBlockState(), Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(), Blocks.LARGE_AMETHYST_BUD.defaultBlockState(), 
//			Blocks.AMETHYST_CLUSTER.defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
//			new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1))
//			.rangeUniform(VerticalAnchor.absolute(12), VerticalAnchor.absolute(500)).squared().rarity(53));
//	
//	public static final ConfiguredFeature<?, ?> POWDER_SNOW = register("powder_snow", 
//			Feature.ORE.configured(new OreConfiguration(new BlockMatchTest(Blocks.SNOW_BLOCK), Blocks.POWDER_SNOW.defaultBlockState(), 40))
//			.rangeUniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(120)).count(1));
//	
//	protected static final ConfiguredFeature<?, ?> MEADOW_BIRCH = register("meadow_birch", Feature.TREE.configured(
//			new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(BlockStates.BIRCH_LOG), new StraightTrunkPlacer(7, 2, 0), 
//			new SimpleStateProvider(BlockStates.BIRCH_LEAVES), new SimpleStateProvider(BlockStates.BIRCH_SAPLING),
//			new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().decorators(Lists.newArrayList(new BeehiveDecorator(1.0F))).build()));
//	
//	public static final ConfiguredFeature<?, ?> MEADOW_BIRCH_TREE = register("meadow_birch_tree",
//			Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(Lists.newArrayList(), MEADOW_BIRCH))
//			.decorated(Features.Decorators.HEIGHTMAP_WITH_TREE_THRESHOLD_SQUARED).rarity(90));
//	
//	public static final ConfiguredFeature<?, ?> MEADOW_FLOWERS = register("meadow_birch_tree", Feature.FLOWER.configured(
//			new RandomPatchConfiguration.GrassConfigurationBuilder(new WeightedStateProvider(
//			new SimpleWeightedRandomList.Builder<BlockState>().add(BlockStates.CORNFLOWER, 2).add(BlockStates.ALLIUM, 2).add(BlockStates.OXEYE_DAISY, 4)), 
//			SimpleBlockPlacer.INSTANCE).tries(64).build()).decorated(FeatureDecorator.SPREAD_32_ABOVE.configured(NoneDecoratorConfiguration.INSTANCE))
//			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING)).squared()).count(4));
//
//	protected static RangeDecoratorConfiguration triangle(int min, int max, int plateau) {
//		return new RangeDecoratorConfiguration(TrapezoidHeight.of(VerticalAnchor.absolute(min), VerticalAnchor.absolute(max), plateau));
//	}
//	
//	private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
//		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Nero.MOD_ID, name), configuredFeature);
//	}

	protected static class BlockStates {
		public static final BlockState AIR = Blocks.AIR.defaultBlockState();
		public static final BlockState DEEPSLATE_COAL_ORE = Blocks.DEEPSLATE_COAL_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_COPPER_ORE = Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_IRON_ORE = Blocks.DEEPSLATE_IRON_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_GOLD_ORE = Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_LAPIS_ORE = Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_REDSTONE_ORE = Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_DIAMOND_ORE = Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState();
		public static final BlockState DEEPSLATE_EMERALD_ORE = Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState();
		public static final BlockState TUFF_ORE = Blocks.TUFF.defaultBlockState();
		public static final BlockState COAL_ORE = Blocks.COAL_ORE.defaultBlockState();
		public static final BlockState COPPER_ORE = Blocks.COPPER_ORE.defaultBlockState();
		public static final BlockState IRON_ORE = Blocks.IRON_ORE.defaultBlockState();
		public static final BlockState GOLD_ORE = Blocks.GOLD_ORE.defaultBlockState();
		public static final BlockState EMERALD_ORE = Blocks.EMERALD_ORE.defaultBlockState();
		public static final BlockState AMETHYST_BLOCK = Blocks.AMETHYST_BLOCK.defaultBlockState();
		public static final BlockState BUDDING_AMETHYST = Blocks.BUDDING_AMETHYST.defaultBlockState();
		public static final BlockState CALCITE = Blocks.CALCITE.defaultBlockState();
		public static final BlockState SMOOTH_BASALT = Blocks.SMOOTH_BASALT.defaultBlockState();
		public static final BlockState LAVA = Blocks.LAVA.defaultBlockState();
		public static final BlockState WATER = Blocks.WATER.defaultBlockState();
		public static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.defaultBlockState();
		public static final BlockState BIRCH_LEAVES = Blocks.BIRCH_LEAVES.defaultBlockState();
		public static final BlockState BIRCH_SAPLING = Blocks.BIRCH_SAPLING.defaultBlockState();
		public static final BlockState DANDELION = Blocks.DANDELION.defaultBlockState();
		public static final BlockState CORNFLOWER = Blocks.CORNFLOWER.defaultBlockState();
		public static final BlockState POPPY = Blocks.POPPY.defaultBlockState();
		public static final BlockState ALLIUM = Blocks.ALLIUM.defaultBlockState();
		public static final BlockState OXEYE_DAISY = Blocks.OXEYE_DAISY.defaultBlockState();
		public static final BlockState AZURE_BLUET = Blocks.AZURE_BLUET.defaultBlockState();
	}
	
	protected static class FluidStates {
		public static final FluidState LAVA = Fluids.LAVA.defaultFluidState();
		public static final FluidState WATER = Fluids.WATER.defaultFluidState();
	}

}
