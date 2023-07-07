
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.urth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UrthModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("urth", "elements"),
				builder -> builder.title(Component.translatable("item_group.urth.elements")).icon(() -> new ItemStack(UrthModBlocks.HYDROGEN.get())).displayItems((parameters, tabData) -> {
					tabData.accept(UrthModBlocks.HYDROGEN.get().asItem());
					tabData.accept(UrthModBlocks.HELIUM.get().asItem());
					tabData.accept(UrthModItems.LITHIUM_INGOT.get());
					tabData.accept(UrthModBlocks.LITHIUM_BLOCK.get().asItem());
					tabData.accept(UrthModItems.LITHIUM_NUGGET.get());
					tabData.accept(UrthModBlocks.BERYLLIUM_BLOCK.get().asItem());
					tabData.accept(UrthModItems.BERYLLIUM_INGOT.get());
					tabData.accept(UrthModItems.BERYLLIUM_NUGGET.get());
				}).withSearchBar());
	}
}
