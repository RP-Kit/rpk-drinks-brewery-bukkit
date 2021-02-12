package com.rpkit.drinks.bukkit.brewery.drink;

import com.dre.brewery.BPlayer;
import com.rpkit.drinks.bukkit.brewery.RPKDrinksBreweryBukkit;
import com.rpkit.characters.bukkit.character.RPKCharacter;
import com.rpkit.core.plugin.RPKPlugin;
import com.rpkit.drink.bukkit.drink.RPKDrink;
import com.rpkit.drink.bukkit.drink.RPKDrinkName;
import com.rpkit.drink.bukkit.drink.RPKDrinkService;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BreweryDrinkService implements RPKDrinkService {
    private final RPKDrinksBreweryBukkit plugin;

    public BreweryDrinkService(RPKDrinksBreweryBukkit plugin) {
        this.plugin = plugin;
    }

    @Override
    public RPKPlugin getPlugin() {
        return plugin;
    }

    @Override
    public List<RPKDrink> getDrinks() {
        return new ArrayList<>();
    }

    @Override
    public RPKDrink getDrink(RPKDrinkName drinkName) {
        return null;
    }

    @Override
    public RPKDrink getDrink(ItemStack item) {
        return null;
    }

    @Override
    public int getDrunkenness(RPKCharacter character) {
        BPlayer bPlayer = BPlayer.get(plugin.getServer().getPlayer(Objects.requireNonNull(character.getMinecraftProfile()).getMinecraftUUID()));
        if (bPlayer == null) {
            return 0;
        }
        return bPlayer.getDrunkeness();
    }

    @Override
    public void setDrunkenness(RPKCharacter character, int drunkenness) {
        BPlayer bPlayer = BPlayer.get(plugin.getServer().getPlayer(Objects.requireNonNull(character.getMinecraftProfile()).getMinecraftUUID()));
        if (bPlayer == null) {
            return;
        }
        bPlayer.setData(drunkenness, 1);
    }
}
