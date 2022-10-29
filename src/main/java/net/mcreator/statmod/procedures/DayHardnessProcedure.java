package net.mcreator.statmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.statmod.network.StatModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DayHardnessProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (StatModModVariables.MapVariables.get(world).MobStatMultiplier < 10) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.00002;
			StatModModVariables.MapVariables.get(world).syncData(world);
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.00001;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
