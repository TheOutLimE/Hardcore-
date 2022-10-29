package net.mcreator.statmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.statmod.network.StatModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DamageMultiplierProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getWorld(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (StatModModVariables.MapVariables.get(world).mobdammul > 0.5) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000000,
							(int) Math.floor(StatModModVariables.MapVariables.get(world).mobdammul), (true), (true)));
			} else {
				if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ARTHROPOD : false) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000000,
								(int) Math.floor(StatModModVariables.MapVariables.get(world).mobdammul), (true), (true)));
				} else {
					if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ILLAGER : false) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000000,
									(int) Math.floor(StatModModVariables.MapVariables.get(world).mobdammul), (true), (true)));
					} else {
						if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.WATER : false) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000000,
										(int) Math.floor(StatModModVariables.MapVariables.get(world).mobdammul), (true), (true)));
						} else {
							if (entity instanceof EnderMan) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20000000,
											(int) Math.floor(StatModModVariables.MapVariables.get(world).mobdammul), (true), (true)));
							}
						}
					}
				}
			}
		}
	}
}
