
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.statmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.statmod.block.SharpeningBlockBlock;
import net.mcreator.statmod.StatModMod;

public class StatModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StatModMod.MODID);
	public static final RegistryObject<Block> SHARPENING_BLOCK = REGISTRY.register("sharpening_block", () -> new SharpeningBlockBlock());
}
