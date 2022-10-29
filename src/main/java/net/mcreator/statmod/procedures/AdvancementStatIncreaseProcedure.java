package net.mcreator.statmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.Advancement;

import net.mcreator.statmod.network.StatModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AdvancementStatIncreaseProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getPlayer().level, event.getAdvancement());
	}

	public static void execute(LevelAccessor world, Advancement advancement) {
		execute(null, world, advancement);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Advancement advancement) {
		if (advancement == null)
			return;
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/mine_stone")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/mine_diamond")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/enchant_item")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:husbandry/tame_an_animal")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).Agility = StatModModVariables.MapVariables.get(world).Agility + 0.15;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/deflect_arrow")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/enter_the_nether")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.3;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/form_obsidian")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/follow_ender_eye")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/enter_the_end")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 2;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/dragon_breath")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.35;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/elytra")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).Agility = StatModModVariables.MapVariables.get(world).Agility + 1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/shiny_gear")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.2;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 2;
			StatModModVariables.MapVariables.get(world).syncData(world);
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
			StatModModVariables.MapVariables.get(world).Agility = StatModModVariables.MapVariables.get(world).Agility + 0.15;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/cure_zombie_villager")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).Agility = StatModModVariables.MapVariables.get(world).Agility + 0.1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/hero_of_the_village"))
						.equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/find_end_city")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/find_bastion")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.5;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/find_fortress")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).Agility = StatModModVariables.MapVariables.get(world).Agility + 0.1;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/uneasy_alliance")).equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).mobdammul = StatModModVariables.MapVariables.get(world).mobdammul + 0.2;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
		if (world instanceof Level _lvl && _lvl.getServer() != null
				? _lvl.getServer().getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/obtain_ancient_debris"))
						.equals(advancement)
				: false) {
			StatModModVariables.MapVariables.get(world).MobStatMultiplier = StatModModVariables.MapVariables.get(world).MobStatMultiplier + 0.8;
			StatModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
