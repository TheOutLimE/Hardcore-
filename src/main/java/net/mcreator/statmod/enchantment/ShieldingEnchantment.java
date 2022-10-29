
package net.mcreator.statmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class ShieldingEnchantment extends Enchantment {
	public ShieldingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 2;
	}
}
