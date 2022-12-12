package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.scheduler.BukkitRunnable;

public class border extends BukkitRunnable {
    int[] speed;
    int radius;

    border(int[] speed,int radius){
        this.speed = speed;
        this.radius = radius;
    }


    @Override
    public void run() {




        speed[0] = (v.now[0] - b.r) / v.time;
        speed[1] = (v.now[1] - b.r) / v.time;
        speed[2] = (v.now[2] - b.r) / v.time;
        speed[3] = (v.now[3] - b.r) / v.time;
        if (v.time > 0) {
            v.now[0] = v.now[0] - speed[0];
            v.now[1] = v.now[1] - speed[1];
            v.now[2] = v.now[2] - speed[2];
            v.now[3] = v.now[3] - speed[3];
        }
    }

}
