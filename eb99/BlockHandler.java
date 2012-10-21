package eb99;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler extends GameRegistry {
  public static void registerBlocks() {
    GameRegistry.registerBlock(NewMod.colouredBrick, ColouredBrickItem.class);
    GameRegistry.registerBlock(NewMod.mud);
    GameRegistry.registerBlock(NewMod.slimePad);
    GameRegistry.registerBlock(NewMod.willowLog);
    GameRegistry.registerBlock(NewMod.willowPlank);
    GameRegistry.registerBlock(NewMod.willowLeaves);
  } 
} 