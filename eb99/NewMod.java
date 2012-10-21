package eb99;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.BogBiome;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;







@NetworkMod(clientSideRequired=true, serverSideRequired=false)
@Mod(modid="MT", name="Mod Tutorials", version="1.0")
public class NewMod
{
  public static Block colouredBrick;
  public static Block mud;
  public static Block slimePad;
  public static BiomeGenBase bogbiome;
  public static CommonProxy proxy;
  
  @Mod.Init
  public void init(FMLInitializationEvent initEvent) {
    colouredBrick = new ColouredBrick(201).setBlockName("ColouredBrick").setStepSound(Block.soundMetalFootstep);
    mud = new Mud(202, 32).setBlockName("mud").setStepSound(Block.soundMetalFootstep);
    slimePad = new SlimePad(203, 48).setBlockName("slimePad").setStepSound(Block.soundMetalFootstep);
    bogbiome = new BogBiome(25);
    BlockHandler.registerBlocks();
    LangaugeHandler.registerNames();
    GameRegistry.addBiome(bogbiome);
  } 
} 