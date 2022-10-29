package net.mcreator.statmod.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.statmod.init.StatModModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CombineSystemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Sharpness = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Items.WOODEN_SWORD) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StatModModItems.TOME.get()) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) > 4.9) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(1)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper
								.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
						if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
							_enchantments.remove(Enchantments.SHARPNESS);
							EnchantmentHelper.setEnchantments(_enchantments,
									(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
											&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
						}
					}
					((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt
									? ((Slot) _slt.get(0)).getItem()
									: ItemStack.EMPTY))
							.enchant(Enchantments.SHARPNESS,
									(int) (EnchantmentHelper
											.getItemEnchantmentLevel(Enchantments.SHARPNESS,
													(entity instanceof ServerPlayer _plrSlotItem
															&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																	? ((Slot) _slt.get(0)).getItem()
																	: ItemStack.EMPTY))
											+ 1));
				}
			}
		}
	}
}
