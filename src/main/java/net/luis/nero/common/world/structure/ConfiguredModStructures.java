package net.luis.nero.common.world.structure;

import net.luis.nero.Nero;
import net.luis.nero.init.world.structure.ModStructures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.structure.Structure;

public class ConfiguredModStructures {
	
	// TODO: https://github.com/TelepathicGrunt/StructureTutorialMod
	
	public static final StructureFeature<NoFeatureConfig, ? extends Structure<NoFeatureConfig>> DEEPSLATE_MINESHAFT = 
			register("deepslate_mineshaft", ModStructures.DEEPSLATE_MINESHAFT.get().configured(NoFeatureConfig.INSTANCE));
	
	private static <FC extends IFeatureConfig, F extends Structure<FC>> StructureFeature<FC, F> register(String name, StructureFeature<FC, F> structure) {
		return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_STRUCTURE_FEATURE, new ResourceLocation(Nero.MOD_ID, name), structure);
	}

}