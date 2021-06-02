package net.luis.nero.common.world.feature;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ReducedExposedOreFeature extends Feature<OreFeatureConfig> {

	// TODO: create
	
	public ReducedExposedOreFeature() {
		super(OreFeatureConfig.CODEC);
	}

	@Override
	public boolean place(ISeedReader seedReader, ChunkGenerator chunkGenerator, Random rng, BlockPos pos, OreFeatureConfig config) {
		return true;
	}

}