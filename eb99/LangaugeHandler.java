package eb99;

import net.minecraft.src.ItemStack;

public class LangaugeHandler
{
  public static void registerNames() {
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 0), "White Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 1), "Red Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 2), "Lime Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 3), "Light Blue Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 4), "Yellow Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 5), "Purple Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 6), "Turquiose Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 7), "Orange Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 8), "Dark Green Stone Bricks");
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.colouredBrick, 1, 9), "Black Stone Bricks");
    
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.mud), "Mud");
    
    cpw.mods.fml.common.registry.LanguageRegistry.addName(new ItemStack(NewMod.slimePad), "Slime Pad");
  } 
} 