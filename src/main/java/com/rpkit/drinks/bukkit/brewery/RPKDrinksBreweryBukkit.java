package com.rpkit.drinks.bukkit.brewery;

import com.rpkit.drinks.bukkit.brewery.drink.BreweryDrinkService;
import com.rpkit.core.bukkit.plugin.RPKBukkitPlugin;
import com.rpkit.core.service.Services;
import com.rpkit.drink.bukkit.drink.RPKDrinkService;

public class RPKDrinksBreweryBukkit extends RPKBukkitPlugin {

    @Override
    public void onEnable() {
        Services.INSTANCE.set(RPKDrinkService.class, new BreweryDrinkService(this));
    }
}
