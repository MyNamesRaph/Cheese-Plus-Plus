package myNamesRaph.test.objects.items;

import myNamesRaph.test.Test;
import myNamesRaph.test.init.ItemInit;
import myNamesRaph.test.proxy.ClientProxy;
import myNamesRaph.test.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Test.tab_cheeseplusplus);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Test.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
