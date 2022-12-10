package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gamelound")){
        v.gamelound = Integer.valueOf(args[0]);
        }
        return false;
    }
}
