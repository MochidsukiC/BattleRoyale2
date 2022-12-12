package net.mochidsuki.corsica.battleroyale2;

import org.bukkit.scheduler.BukkitRunnable;

public class border extends BukkitRunnable {
    int[] speed;
    int radius;
    int rtime;


    public border(int[] speed, int radius, int rtime) {
        this.speed = speed;
        this.radius = radius;
        this.rtime = rtime;
    }


    @Override
    public void run() {

        if (rtime > 0) {
            v.now[0] = v.now[0] + speed[0];
            v.now[1] = v.now[1] + speed[1];
            v.now[2] = v.now[2] + speed[2];
            v.now[3] = v.now[3] + speed[3];
        }

    }

}
