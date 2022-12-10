package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.scheduler.BukkitRunnable;

public class border extends BukkitRunnable {


    @Override
    public void run() {



        int[] speed = new int[4];
        speed[0] = (b.now[0] - b.r) / v.time;
        speed[1] = (b.now[1] - b.r) / v.time;
        speed[2] = (b.now[2] - b.r) / v.time;
        speed[3] = (b.now[3] - b.r) / v.time;
        if (v.time > 0) {
            b.now[0] = b.now[0] - speed[0];
            b.now[1] = b.now[1] - speed[1];
            b.now[2] = b.now[2] - speed[2];
            b.now[3] = b.now[3] - speed[3];
        }
    }

}
