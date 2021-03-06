package net.luis.nero.init.world.dimension;

import net.luis.nero.Nero;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.LevelStem;

public class ModLevelStems {
	
    public static final ResourceKey<LevelStem> DEEPSLATE = ResourceKey.create(Registry.LEVEL_STEM_REGISTRY, new ResourceLocation(Nero.MOD_ID, "deepslate"));
	public static final ResourceKey<LevelStem> OVERWORLD = ResourceKey.create(Registry.LEVEL_STEM_REGISTRY, new ResourceLocation(Nero.MOD_ID, "overworld"));
    public static final ResourceKey<LevelStem> TEST = ResourceKey.create(Registry.LEVEL_STEM_REGISTRY, new ResourceLocation(Nero.MOD_ID, "test"));

}
