package myNamesRaph.test.init;

import java.util.ArrayList;
import java.util.List;

import myNamesRaph.test.objects.items.ItemBase;
import myNamesRaph.test.objects.items.tools.ToolAxe;
import myNamesRaph.test.objects.items.tools.ToolHoe;
import myNamesRaph.test.objects.items.tools.ToolPickaxe;
import myNamesRaph.test.objects.items.tools.ToolSpade;
import myNamesRaph.test.objects.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//MATERIALS
	public static final ToolMaterial MATERIAL_CHEESE = EnumHelper.addToolMaterial("material_cheese", 2, 32, 20.0F, 1.0F, 30);
	
	
	//ITEMS
	public static final Item CHEESE = new ItemBase("food_cheese");
	public static final Item CHEESE_CURD = new ItemBase("curd_cheese");
	public static final Item RAW_CHEESE_STICK = new ItemBase("raw_stick_cheese");
	public static final Item COOKED_CHEESE_STICK = new ItemBase("cooked_stick_cheese");
	
	//TOOLS
	public static final ItemSword CHEESE_SWORD = new ToolSword("sword_cheese", MATERIAL_CHEESE);
	public static final ItemSpade CHEESE_SHOVEL = new ToolSpade("shovel_cheese", MATERIAL_CHEESE);
	public static final ItemPickaxe CHEESE_PICKAXE = new ToolPickaxe("pickaxe_cheese", MATERIAL_CHEESE);
	public static final ItemAxe CHEESE_AXE = new ToolAxe("axe_cheese", MATERIAL_CHEESE);
	public static final ItemHoe CHEESE_HOE = new ToolHoe("hoe_cheese", MATERIAL_CHEESE);
}
