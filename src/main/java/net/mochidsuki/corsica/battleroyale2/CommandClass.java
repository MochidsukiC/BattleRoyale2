package net.mochidsuki.corsica.battleroyale2;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import static net.mochidsuki.corsica.battleroyale2.v.now;


public class CommandClass implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gameround")){
            v.gameround = Integer.parseInt(args[0]);
            Roundsystemc r = new Roundsystemc();
            r.Roundsystem();
            return true;
        }
        if(command.getName().equalsIgnoreCase("brgame")){
            if(args[0].equalsIgnoreCase("reload")){
                Config config = new Config(Battleroyale2.getPlugin());
                config.load();
                return true;
            }
        }
        if(command.getName().equalsIgnoreCase("debugerb")){
            sender.sendMessage(now[0]+","+ now[1]+","+ now[2]+","+ now[3]+","+v.roundstime[1]);
            return true;
        }
        return false;
    }
}
