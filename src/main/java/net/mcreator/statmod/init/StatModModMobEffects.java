
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.statmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.statmod.potion.BleedingMobEffect;
import net.mcreator.statmod.StatModMod;

public class StatModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StatModMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
