package com;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.GameRule;


public final class joo31775 extends JavaPlugin {

    @Override
    public void onEnable() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
