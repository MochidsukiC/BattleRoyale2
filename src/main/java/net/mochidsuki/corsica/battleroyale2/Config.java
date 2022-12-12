package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class Config {
    private final Plugin plugin;
    private FileConfiguration config = null;

    public Config(Plugin plugin) {
        this.plugin = plugin;
        // ロードする
        load();
    }
    public void load() {
        // 設定ファイルを保存
        plugin.saveDefaultConfig();
        if (config != null) { // configが非null == リロードで呼び出された
            plugin.reloadConfig();
        }
        config = plugin.getConfig();
        v.mr = config.getInt("MAP.Radius");
        v.mcx = config.getInt("MAP.Center.x");
        v.mcz = config.getInt("MAP.Center.z");
    }
}
