package net.mcreator.statmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.statmod.network.StatModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RegenMobProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (StatModModVariables.MapVariables.get(world).MobStatMultiplier > 6) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1, (true), (false)));
			} else {
				if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1, (true), (false)));
				} else {
					if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ILLAGER : false) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1, (true), (false)));
					} else {
						if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.WATER : false) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 30, 1, (true), (false)));
						}
					}
				}
			}
		}
	}
}
