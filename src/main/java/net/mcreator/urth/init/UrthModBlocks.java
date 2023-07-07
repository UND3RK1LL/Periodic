
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.urth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.urth.block.LithiumBlockBlock;
import net.mcreator.urth.block.HydrogenBlock;
import net.mcreator.urth.block.HeliumBlock;
import net.mcreator.urth.block.BerylliumBlockBlock;
import net.mcreator.urth.UrthMod;

public class UrthModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UrthMod.MODID);
	public static final RegistryObject<Block> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenBlock());
	public static final RegistryObject<Block> HELIUM = REGISTRY.register("helium", () -> new HeliumBlock());
	public static final RegistryObject<Block> LITHIUM_BLOCK = REGISTRY.register("lithium_block", () -> new LithiumBlockBlock());
	public static final RegistryObject<Block> BERYLLIUM_BLOCK = REGISTRY.register("beryllium_block", () -> new BerylliumBlockBlock());
}
