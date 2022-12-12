package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;


public class CommandClass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gamelound")){
            v.gameround = Integer.parseInt(args[0]);
            int[] center = new int[3];
            int[] speed = new int[3];
            int radius = 0;
            int rtime = 0;
            int stime = 0;
            double radiusk = 0;
            switch (v.gameround){
                case 1:
                    radius = v.mr;
                    radiusk = 0.8;
                    center[1] = v.mcx;
                    center[2] = v.mcz;
                    rtime = 96;
                    stime = 90;
                    break;
                case 2:
                    radius = (int)(v.mr * 0.8);
                    radiusk = 0.6;
                    break;
            }
            Random rnd = new Random();
            center[0] = rnd.nextInt(9);
            switch (center[0]){
                case 0:
                    center[1] = (int)(center[1] - radius*(1-radiusk));
                    center[2] = (int)(center[2] + radius*(1-radiusk));
                    break;
                case 1:
                    center[2] = (int)(center[2] + radius*(1-radiusk));
                    break;
                case 2:
                    center[1] = (int)(center[1] + radius*(1-radiusk));
                    center[2] = (int)(center[2] + radius*(1-radiusk));
                    break;
                case 3:
                    center[1] = (int)(center[1] - radius*(1-radiusk));
                    break;
                case 4:
                    break;
                case 5:
                    center[1] = (int)(center[1] + radius*(1-radiusk));
                    break;
                case 6:
                    center[1] = (int)(center[1] - radius*(1-radiusk));
                    center[2] = (int)(center[2] - radius*(1-radiusk));
                    break;
                case 7:
                    center[2] = (int)(center[2] - radius*(1-radiusk));
                    break;
                case 8:
                    center[1] = (int)(center[1] + radius*(1-radiusk));
                    center[2] = (int)(center[2] - radius*(1-radiusk));
                    break;
            }
            int[] target = new int[3];
            target[0] = (int)(center[1] + radius*radiusk);
            target[1] = (int)(center[1] - radius*radiusk);
            target[2] = (int)(center[2] + radius*radiusk);
            target[3] = (int)(center[2] - radius*radiusk);

            speed[0] = (target[0] - v.now[0])/rtime;
            speed[1] = (target[1] - v.now[1])/rtime;
            speed[2] = (target[2] - v.now[2])/rtime;
            speed[3] = (target[3] - v.now[3])/rtime;

            new border(speed,radius,rtime).runTaskTimer(Battleroyale2.getPlugin(), stime, 20L);
            return true;
        }
        if(command.getName().equalsIgnoreCase("debuger")){
            sender.sendMessage(v.now[0]+","+v.now[1]+","+v.now[2]+","+v.now[3]);
        }
        return false;
    }
}
