package eb99;

import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ColouredBrickItem extends ItemBlock
{
  public ColouredBrickItem(int par1)
  {
    super(par1);
    setMaxDamage(0);
    setHasSubtypes(true);
  } 
  
  public String getItemNameIS(ItemStack i) {
    switch (i.getItemDamage()) {
    case 0:  return "White Stone Bricks";
    case 1:  return "Red Stone Bricks";
    case 2:  return "Lime Stone Bricks";
    case 3:  return "Light Blue Stone Bricks";
    case 4:  return "Yellow Stone Bricks";
    case 5:  return "Purple Stone Bricks";
    case 6:  return "Turquiose Stone Bricks";
    case 7:  return "Orange Stone Bricks";
    case 8:  return "Dark Green Stone Bricks";
    case 9:  return "Black Stone Bricks"; } 
    return "";
  } 
  

  public int getMetadata(int par1)
  {
    return par1;
  } 
  
  @SideOnly(Side.CLIENT)
  public int getIconFromDamage(int par1)
  {
    return NewMod.colouredBrick.getBlockTextureFromSideAndMetadata(2, par1);
  } 
} 