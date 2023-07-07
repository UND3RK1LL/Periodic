
package net.mcreator.urth.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BerylliumIngotItem extends Item {
	public BerylliumIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
