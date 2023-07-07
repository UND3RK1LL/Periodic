
package net.mcreator.urth.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LithiumNuggetItem extends Item {
	public LithiumNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
