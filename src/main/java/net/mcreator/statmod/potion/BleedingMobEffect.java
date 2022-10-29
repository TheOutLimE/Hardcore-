
package net.mcreator.statmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.statmod.procedures.BleedingActiveTickConditionProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6815744);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stat_mod.bleeding";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return BleedingActiveTickConditionProcedure.execute(amplifier, duration);
	}
}
