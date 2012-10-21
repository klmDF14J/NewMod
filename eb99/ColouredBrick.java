package eb99;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.List;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class ColouredBrick extends Block
{
  public ColouredBrick(int ID)
  {
    super(ID, Material.rock);
    setCreativeTab(CreativeTabs.tabBlock);
    setHardness(1F);
    setResistance(3F);
  } 
  
  @SideOnly(Side.CLIENT)
  public String getTextureFile() {
    return "/eb99/Blocks.png";
  } 
  @SideOnly(Side.CLIENT)
  public int getBlockTextureFromSideAndMetadata(int i, int l) {
    switch (l) {
    case 0: 
      return 0;
    case 1:  return 1;
    case 2:  return 2;
    case 3:  return 3;
    case 4:  return 4;
    case 5:  return 5;
    case 6:  return 6;
    case 7:  return 7;
    case 8:  return 8;
    case 9:  return 9; } 
    return 0;
  } 
  
  public void getSubBlocks(int i, CreativeTabs tab, List list)
  {
    list.add(new ItemStack(i, 1, 0));
    list.add(new ItemStack(i, 1, 1));
    list.add(new ItemStack(i, 1, 2));
    list.add(new ItemStack(i, 1, 3));
    list.add(new ItemStack(i, 1, 4));
    list.add(new ItemStack(i, 1, 5));
    list.add(new ItemStack(i, 1, 6));
    list.add(new ItemStack(i, 1, 7));
    list.add(new ItemStack(i, 1, 8));
    list.add(new ItemStack(i, 1, 9));
  } 
} 