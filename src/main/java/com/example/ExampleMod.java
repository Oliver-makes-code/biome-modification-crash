package com.example;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final RegistryKey<PlacedFeature> NETHERRACK_ORE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("modid","netherrack_ore"));

	@Override
	public void onInitialize() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, NETHERRACK_ORE);
	}
}