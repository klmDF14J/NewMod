//section 3
package net.minecraft.src;

import eb99.NewMod;

public class BogBiome extends BiomeGenBase
{
	public BogBiome(int par1) {
		super(par1);
		this.theBiomeDecorator.mushroomsPerChunk = 5;
		//fillerBlock =(byte)Block.glass.blockID;
		topBlock =(byte)NewMod.mud.blockID; //if u dont want your biome being mod out of your custom block //change blockmod_???.(blockname) to Block.(blockname)
		setBiomeName("Bogland");
	}
}