package com.rit.sucy;

import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

import java.util.Hashtable;

/**
 * Passively grants bonus jump height
 */
public class JumpEnchantment extends PotionPassiveEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public JumpEnchantment(Plugin plugin) {
        super(plugin, EnchantDefaults.JUMP, ItemSets.BOOTS.getItems());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.JUMP;
    }
}
