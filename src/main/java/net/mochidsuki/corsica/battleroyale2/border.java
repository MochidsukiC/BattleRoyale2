package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.scheduler.BukkitRunnable;

public class border extends BukkitRunnable {


    @Override
    public void run(int[] now , int r , int time) {
        int[] speed = new int[4];
        speed[0] = (now[0] - r) / time;
        speed[1] = (now[1] - r) / time;
        speed[2] = (now[2] - r) / time;
        speed[3] = (now[3] - r) / time;
        if (time > 0) {
            now[0] = now[0] - speed[0];
            now[1] = now[1] - speed[1];
            now[2] = now[2] - speed[2];
            now[3] = now[3] - speed[3];


        }
    }
}
