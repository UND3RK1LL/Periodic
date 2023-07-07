
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.urth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.urth.item.LithiumNuggetItem;
import net.mcreator.urth.item.LithiumIngotItem;
import net.mcreator.urth.item.BerylliumNuggetItem;
import net.mcreator.urth.item.BerylliumIngotItem;
import net.mcreator.urth.UrthMod;

public class UrthModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UrthMod.MODID);
	public static final RegistryObject<Item> HYDROGEN = block(UrthModBlocks.HYDROGEN);
	public static final RegistryObject<Item> HELIUM = block(UrthModBlocks.HELIUM);
	public static final RegistryObject<Item> LITHIUM_INGOT = REGISTRY.register("lithium_ingot", () -> new LithiumIngotItem());
	public static final RegistryObject<Item> LITHIUM_BLOCK = block(UrthModBlocks.LITHIUM_BLOCK);
	public static final RegistryObject<Item> LITHIUM_NUGGET = REGISTRY.register("lithium_nugget", () -> new LithiumNuggetItem());
	public static final RegistryObject<Item> BERYLLIUM_BLOCK = block(UrthModBlocks.BERYLLIUM_BLOCK);
	public static final RegistryObject<Item> BERYLLIUM_INGOT = REGISTRY.register("beryllium_ingot", () -> new BerylliumIngotItem());
	public static final RegistryObject<Item> BERYLLIUM_NUGGET = REGISTRY.register("beryllium_nugget", () -> new BerylliumNuggetItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
