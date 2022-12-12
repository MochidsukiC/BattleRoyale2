package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Battleroyale2 extends JavaPlugin {
    private static Plugin plugin;

    @Override
    public void onEnable() {
        getLogger().info("Battle Royale 2 Pluginが目を覚ました！");
        getServer().getPluginManager().registerEvents(new event(), this);
        getCommand("gameround").setExecutor(new CommandClass()); //timer
        getCommand("debugerb").setExecutor(new CommandClass()); //debuger
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        v.mr = config.getInt("MAP.Radius");
        v.mcx = config.getInt("MAP.Center.x");
        v.mcz = config.getInt("MAP.Center.z");
        plugin = this;

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Battle Royale 2 Pluginがおねんねした");
        // Plugin shutdown logic
    }
    public static Plugin getPlugin() {
        return plugin;
    }
}




class v{
    static int[] now = new int[4];
    static int gameround;
    static int mr;
    static int mcx;
    static int mcz;
}




