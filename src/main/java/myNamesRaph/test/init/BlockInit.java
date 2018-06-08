package myNamesRaph.test.init;

import java.util.ArrayList;
import java.util.List;

import myNamesRaph.test.init.blocks.slab.CustomBlockSlab;
import myNamesRaph.test.objects.blocks.block_cheese;
import myNamesRaph.test.objects.blocks.lamp_cheese;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//BLOCKS
	public static final Block BLOCK_CHEESE = new block_cheese("block_cheese", Material.SPONGE);
	public static final Block LAMP_CHEESE = new lamp_cheese("lamp_cheese", Material.SPONGE);
	
	//SLABS
	public static CustomBlockSlab CHEESE_SLAB;
	public static CustomBlockSlab CHEESE_SLAB_DOUBLE;
	
	public static void init()
	{
		CHEESE_SLAB = new CustomBlockSlab.Half("slab_cheese", Material.SPONGE);
		CHEESE_SLAB_DOUBLE = new CustomBlockSlab.Double("slab_cheese_double", Material.SPONGE);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(CHEESE_SLAB, CHEESE_SLAB_DOUBLE);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemSlab(CHEESE_SLAB,CHEESE_SLAB, CHEESE_SLAB_DOUBLE).setRegistryName(CHEESE_SLAB.getRegistryName()));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(CHEESE_SLAB));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}













