package myNamesRaph.test.objects.items.tools;

import myNamesRaph.test.Test;
import myNamesRaph.test.init.ItemInit;
import myNamesRaph.test.util.IHasModel;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
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
