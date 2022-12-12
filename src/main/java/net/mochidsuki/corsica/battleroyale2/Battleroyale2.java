package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Battleroyale2 extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("Battle Royale 2 Pluginが目を覚ました！");
        getServer().getPluginManager().registerEvents(new event(), this);
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        v.mr = config.getInt("MAP.Radius");
        v.mcx = config.getInt("MAP.Center.x");
        v.mcz = config.getInt("MAP.Center.z");

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Battle Royale 2 Pluginがおねんねした");
        // Plugin shutdown logic
    }
}




class v{
    static int[] now;
    static int time;
    static int gameround;
    static int mr;
    static int mcx;
    static int mcz;
}




