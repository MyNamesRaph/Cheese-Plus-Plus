package myNamesRaph.test.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class block_cheese extends BlockBase
{

	public block_cheese(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.CLOTH);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("sword", 0);
		//setLightLevel(5.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}

}
