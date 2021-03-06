package net.luis.nero;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.luis.nero.init.block.ModBlocks;
import net.luis.nero.init.block.item.ModBlockItems;
import net.luis.nero.init.block.util.ModBlockEntityTypes;
import net.luis.nero.init.block.util.ModMenuTypes;
import net.luis.nero.init.enchantment.ModEnchantments;
import net.luis.nero.init.items.ModItems;
import net.luis.nero.init.potion.ModEffects;
import net.luis.nero.init.potion.ModPotions;
import net.luis.nero.init.villager.ModPoiTypes;
import net.luis.nero.init.villager.ModVillagerProfessions;
import net.luis.nero.init.world.ModWorldTypes;
import net.luis.nero.init.world.biome.ModBiomes;
import net.luis.nero.init.world.levelgen.carver.ModWorldCarvers;
import net.luis.nero.init.world.levelgen.feature.ModFeatures;
import net.luis.nero.init.world.levelgen.feature.structure.ModStructures;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

//TODO: fix
@Mod(Nero.MOD_ID)
public class Nero {
	
	// add https://www.curseforge.com/minecraft/mc-mods/recipebuilder/files
	// via https://www.cursemaven.com/
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "nero_generation";
	public static final String MINECRAFT_ID = "minecraft";
	public static final boolean RUN_IN_IDE = FMLEnvironment.production;
	
	private static Nero nero_generation;
	
	public Nero() {
		nero_generation = this;
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.BLOCKS.register(eventBus);
		ModBlockItems.ITEMS.register(eventBus);
		ModMenuTypes.CONTAINERS.register(eventBus);
		ModBlockEntityTypes.BLOCK_ENTITIES.register(eventBus);
		
		ModItems.ITEMS.register(eventBus);
		
		ModPoiTypes.POI_TYPES.register(eventBus);
		ModVillagerProfessions.PROFESSIONS.register(eventBus);
		
		ModEnchantments.ENCHANTMENTS.register(eventBus);
		
		ModEffects.MOB_EFFECTS.register(eventBus);
		ModPotions.POTIONS.register(eventBus);
		
//		ModFeatureDecorators.DECORATORS.register(eventBus);
		ModFeatures.FEATURES.register(eventBus);
//		ModSurfaceBuilders.SURFACE_BUILDERS.register(eventBus);
		ModWorldCarvers.WORLD_CARVERS.register(eventBus);
		ModStructures.STRUCTURES.register(eventBus);
		ModBiomes.BIOMES.register(eventBus);
		ModWorldTypes.WORLD_TYPES.register(eventBus);
	}
	
	public static Nero getInstance() {
		return nero_generation;
	}
	
}