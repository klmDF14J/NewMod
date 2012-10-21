package eb99;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BaseBlock extends Block {

	public BaseBlock(int par1, int par2) {
		super(par1, par2, Material.wood);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1F);
		setResistance(3F);
	}
	public String getTextureFile() {
		return "/eb99/Blocks.png";
	}
	
}
