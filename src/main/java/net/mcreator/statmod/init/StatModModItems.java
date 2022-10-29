
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.statmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.statmod.StatModMod;

public class StatModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StatModMod.MODID);
	public static final RegistryObject<Item> BIG_CREEPER = REGISTRY.register("big_creeper_spawn_egg",
			() -> new ForgeSpawnEggItem(StatModModEntities.BIG_CREEPER, -16751104, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHARPENING_BLOCK = block(StatModModBlocks.SHARPENING_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
