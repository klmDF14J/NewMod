package eb99;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Mud extends Block
{
  public Mud(int par1, int par2)
  {
    super(par1, par2,Material.grass);
    setCreativeTab(CreativeTabs.tabBlock);
    setHardness(1F);
    setResistance(3.0F);
  } 
  public String getTextureFile() {
    return "/eb99/Blocks.png";
  } 
}