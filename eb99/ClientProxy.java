package eb99;

import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy
  extends CommonProxy
{
  public void registerRenderInformation()
  {
    MinecraftForgeClient.preloadTexture("/eb99/Blocks.png");
  } 
} 