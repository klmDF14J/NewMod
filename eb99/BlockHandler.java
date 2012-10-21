package eb99;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler extends GameRegistry {
  public static void registerBlocks() {
    GameRegistry.registerBlock(NewMod.colouredBrick, ColouredBrickItem.class);
    GameRegistry.registerBlock(NewMod.mud);
    GameRegistry.registerBlock(NewMod.slimePad);
  } 
} 