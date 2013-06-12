package com.rit.sucy;

import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Slows enemies on hit
 */
public class SlowEnchantment extends PotionInflictEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public SlowEnchantment(Plugin plugin) {
        super(plugin, EnchantDefaults.SLOWING, ItemSets.PICKAXES.getItems());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SLOW;
    }
}
