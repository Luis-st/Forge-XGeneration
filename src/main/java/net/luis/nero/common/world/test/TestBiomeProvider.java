package net.luis.nero.common.world.test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.mojang.serialization.Codec;

import net.luis.nero.common.world.biome.DeepslateBiomeProvider;
import net.luis.nero.common.world.gen.layer.DeepslateBiomeLayer;
import net.luis.nero.common.world.gen.layer.ModLayer;
import net.luis.nero.init.world.biome.ModBiomeKeys;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.feature.structure.Structure;

public class TestBiomeProvider extends BiomeProvider {
	
	public static final Codec<DeepslateBiomeProvider> CODEC = RegistryLookupCodec.create(Registry.BIOME_REGISTRY)
			.xmap(DeepslateBiomeProvider::new, DeepslateBiomeProvider::getBiomeRegistry).codec();
	
	private final long seed;
	private final Registry<Biome> biomeRegistry;
	private final ModLayer noiseBiomeLayer;
	private static final List<RegistryKey<Biome>> BIOMES = ModBiomeKeys.BIOMES;
	
	public TestBiomeProvider(Registry<Biome> biomeRegistry) {
		this(biomeRegistry, new Random().nextLong());
	}
	
	public TestBiomeProvider(Registry<Biome> biomeRegistry, long seed) {
		super(getStartBiomes(biomeRegistry));
		this.seed = seed;
		this.biomeRegistry = biomeRegistry;
		this.noiseBiomeLayer = DeepslateBiomeLayer.createLayer(seed);
	}

	private static List<Biome> getStartBiomes(Registry<Biome> registry) {
		return BIOMES.stream().map(biome -> registry.get(biome.location())).collect(Collectors.toList());
	}
	
	public long getSeed() {
		return seed;
	}
	
	public Registry<Biome> getBiomeRegistry() {
		return this.biomeRegistry;
	}

	@Override
	public boolean canGenerateStructure(Structure<?> structure) {
		return false;
	}

	@Override
	protected Codec<? extends BiomeProvider> codec() {
		return DeepslateBiomeProvider.CODEC;
	}

	@Override
	public DeepslateBiomeProvider withSeed(long seed) {
		return new DeepslateBiomeProvider(this.biomeRegistry, seed);
	}

	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
		return this.noiseBiomeLayer.get(this.biomeRegistry, x, z);
	}

}
