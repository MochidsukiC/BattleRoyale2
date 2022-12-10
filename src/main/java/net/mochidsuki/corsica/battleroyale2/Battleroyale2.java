package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Battleroyale2 extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Battle Royale 2 Pluginが目を覚ました！");
        getServer().getPluginManager().registerEvents(new event(), this);


        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Battle Royale 2 Pluginがおねんねした");
        // Plugin shutdown logic
    }
}


class b{
    static int[] now;
    static int r;
}

class v{
    static int time;
    static int gamelound;
}




