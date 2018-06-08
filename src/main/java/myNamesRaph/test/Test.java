package myNamesRaph.test;

import myNamesRaph.test.init.BlockInit;
import myNamesRaph.test.init.ItemInit;
import myNamesRaph.test.init.ModRecipes;
import myNamesRaph.test.proxy.CommonProxy;
import myNamesRaph.test.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class Test {

	@Instance
	public static Test instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BlockInit.init();
		
		System.out.println("Hey! You've PreInitialized, good job!");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		System.out.println("Hey! You've Initialized, good job!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Hey! You've PostInitialized, good job!");
	}
	
	public static CreativeTabs tab_cheeseplusplus = new CreativeTabs("tab_cheeseplusplus") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(BlockInit.BLOCK_CHEESE);
		}
	};
}
