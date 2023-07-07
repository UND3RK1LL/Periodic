
package net.mcreator.urth.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BerylliumNuggetItem extends Item {
	public BerylliumNuggetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
