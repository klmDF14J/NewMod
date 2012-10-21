package eb99;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.BogBiome;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;







@NetworkMod(clientSideRequired=true, serverSideRequired=false)
@Mod(modid="MT", name="Mod Tutorials", version="1.0")
public class NewMod
{
  public static Block colouredBrick;
  public static Block mud;
  public static Block slimePad;
  public static Block willowLog;
  public static Block willowPlank;
  public static Block willowLeaves;
  
  public static BiomeGenBase bogbiome;
  
  public static CommonProxy proxy;
  
  public static int colouredBrickID;
  public static int mudID;
  public static int slimePadID;
  public static int willowLogID;
  public static int willowPlankID;
  public static int willowLeavesID;
  
  @PreInit
  public void preInit(FMLPreInitializationEvent preinit) {
	  Configuration config = new Configuration(preinit.getSuggestedConfigurationFile());
	  config.load();
	  colouredBrickID = config.getBlock("ColouredBrick", 200).getInt();
	  mudID = config.getBlock("Mud", 201).getInt();
	  slimePadID = config.getBlock("Slime Pad", 202).getInt();
	  willowLogID = config.getBlock("Willow Log", 203).getInt();
	  willowPlankID = config.getBlock("Willow Plank", 204).getInt();
	  willowLeavesID = config.getBlock("Willow Leaves", 205).getInt();
  }
  
  @Init
  public void init(FMLInitializationEvent initEvent) {
    
	colouredBrick = new ColouredBrick(colouredBrickID).setBlockName("ColouredBrick").setStepSound(Block.soundMetalFootstep);
    mud = new Mud(mudID, 32).setBlockName("mud").setStepSound(Block.soundMetalFootstep);
    slimePad = new SlimePad(slimePadID, 48).setBlockName("slimePad").setStepSound(Block.soundMetalFootstep);
    willowLog = new Log(willowLogID).setBlockName("willowLog").setStepSound(Block.soundMetalFootstep);
    willowPlank = new BaseBlock(willowPlankID, 35).setBlockName("willowPlank").setStepSound(Block.soundMetalFootstep);
    willowLeaves = new Leaves(willowLeavesID, 36).setBlockName("willowLeaves").setStepSound(Block.soundMetalFootstep);
    bogbiome = new BogBiome(25);
    BlockHandler.registerBlocks();
    LangaugeHandler.registerNames();
    GameRegistry.addBiome(bogbiome);
  } 
} 