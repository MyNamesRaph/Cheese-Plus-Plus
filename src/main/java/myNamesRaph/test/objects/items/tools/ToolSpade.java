package myNamesRaph.test.objects.items.tools;

import myNamesRaph.test.Test;
import myNamesRaph.test.init.ItemInit;
import myNamesRaph.test.util.IHasModel;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel {
	
	
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
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
