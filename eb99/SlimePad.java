package eb99;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class SlimePad extends Block
{
  public SlimePad(int par1, int par2)
  {
    super(par1, par2, Material.rock);
    setCreativeTab(CreativeTabs.tabBlock);
    setHardness(1F);
    setResistance(3F);
    setBlockBounds(0F, 0F, 0F, 1F, 0.3F, 1F);
  } 
  
  public void onEntityWalking(World world, int x, int y, int z, Entity entity)
  {
	  entity.motionY += 2.0;
  } 
  public String getTextureFile() {
    return "/eb99/Blocks.png";
  } 
  
  public void addInformation(ItemStack par1ItemStack, List par2List) {
    par2List.add("Bouncy!");
  } 
  public boolean renderAsNormalBlock() {
    return false;
    
  } 
  public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
    setBlockBounds(0F, 0F, 0F, 1F, 0.3F, 1F);
  } 
  public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
  {
      this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
      super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
  }
  
  public boolean isOpaqueCube() {
    return false;
  } 
} 