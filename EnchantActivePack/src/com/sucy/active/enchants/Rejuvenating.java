package com.sucy.active.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sucy.active.ConfigurableEnchantment;
import com.sucy.active.data.EnchantDefaults;
import com.sucy.active.data.ItemSets;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Rejuvenating extends ConfigurableEnchantment {

    public Rejuvenating(Plugin plugin) {
        super(plugin, EnchantDefaults.REJUVENATING, ItemSets.FOOD.getItems(), 2);
        description = "Heals you upon eating";
        suffixGroups.add(SuffixGroups.HEALTH.getKey());
    }

    public void apply(Player player, int level) {
        int health = player.getHealth() + health(level);
        if (health > player.getMaxHealth())
            health = player.getMaxHealth();
        player.setHealth(health);
    }
}
