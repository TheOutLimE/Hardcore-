package net.mcreator.statmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.vehicle.MinecartTNT;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CreeperTntProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Creeper) {
			if (sourceentity instanceof EndCrystal) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.BREAK);
			} else {
				if (sourceentity instanceof Creeper) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
				} else {
					if (sourceentity instanceof PrimedTnt) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
					} else if (sourceentity instanceof MinecartTNT) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
					}
				}
			}
		}
	}
}
