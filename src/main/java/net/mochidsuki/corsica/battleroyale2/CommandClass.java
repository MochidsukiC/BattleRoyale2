package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;


public class CommandClass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gamelound")){
            v.gameround = Integer.parseInt(args[0]);
            int radius;
            double radiusk;
            switch (v.gameround){
                case 1:
                    radius = config.getInt("MAP.Radius");
            }
        }
        return false;
    }
}
