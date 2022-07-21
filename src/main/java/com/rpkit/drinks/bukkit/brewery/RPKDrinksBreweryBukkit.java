package com.rpkit.drinks.bukkit.brewery;

import com.rpkit.core.service.Services;
import com.rpkit.drink.bukkit.drink.RPKDrinkService;
import com.rpkit.drinks.bukkit.brewery.drink.BreweryDrinkService;
import org.bukkit.plugin.java.JavaPlugin;

public class RPKDrinksBreweryBukkit extends JavaPlugin {

    @Override
    public void onEnable() {
        Services.INSTANCE.set(RPKDrinkService.class, new BreweryDrinkService(this));
    }
}
