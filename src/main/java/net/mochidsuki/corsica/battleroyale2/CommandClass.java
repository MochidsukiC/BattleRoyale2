package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;



public class CommandClass implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("gameround")){
            v.gameround = Integer.parseInt(args[0]);
            int[] center = new int[3];
            double[] speed = new double[4];
            int radius = 0;
            int rtime = 0;
            long stime = 0L;
            double radiusk = 0;
            switch (v.gameround){
                case 1:
                    radius = v.mr;
                    radiusk = 0.8;
                    center[1] = v.mcx;
                    center[2] = v.mcz;
                    rtime = 96;
                    stime = v.roundstime[1];
                    v.now[0] = v.mcx+v.mr;
                    v.now[1] = v.mcx-v.mr;
                    v.now[2] = v.mcz+v.mr;
                    v.now[3] = v.mcz-v.mr;
                    break;
                case 2:
                    radius = (int)(radius * 0.8);
                    radiusk = 0.6;
                    rtime = 50;
                    stime = 90L;
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
            int[] target = new int[4];
            target[0] = (int)(center[1] + radius*radiusk);
            target[1] = (int)(center[1] - radius*radiusk);
            target[2] = (int)(center[2] + radius*radiusk);
            target[3] = (int)(center[2] - radius*radiusk);

            speed[0] = (target[0] - v.now[0])/rtime/20;
            speed[1] = (target[1] - v.now[1])/rtime/20;
            speed[2] = (target[2] - v.now[2])/rtime/20;
            speed[3] = (target[3] - v.now[3])/rtime/20;

            new border(speed,radius,rtime).runTaskTimer(Battleroyale2.getPlugin(), stime*20, 1L);
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
            sender.sendMessage(v.now[0]+","+v.now[1]+","+v.now[2]+","+v.now[3]+","+v.roundstime[1]);
            return true;
        }
        return false;
    }
}
