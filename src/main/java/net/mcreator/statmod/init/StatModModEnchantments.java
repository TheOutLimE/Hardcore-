
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.statmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.statmod.enchantment.ShieldingEnchantment;
import net.mcreator.statmod.enchantment.ResistanceEnchantment;
import net.mcreator.statmod.StatModMod;

public class StatModModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, StatModMod.MODID);
	public static final RegistryObject<Enchantment> SHIELDING = REGISTRY.register("shielding", () -> new ShieldingEnchantment());
	public static final RegistryObject<Enchantment> RESISTANCE = REGISTRY.register("resistance", () -> new ResistanceEnchantment());
}
