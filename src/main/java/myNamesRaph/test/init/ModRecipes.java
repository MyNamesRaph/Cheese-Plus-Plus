package myNamesRaph.test.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ItemInit.CHEESE, 2), 1.5F);
		GameRegistry.addSmelting(ItemInit.RAW_CHEESE_STICK, new ItemStack(ItemInit.COOKED_CHEESE_STICK, 1), 1.5F);
	}
}
