package net.mochidsuki.corsica.battleroyale2;


import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;

public class event implements Listener{
    @EventHandler
    public void EntityDropItemEvent(EntityDropItemEvent event){
        Item item = event.getItemDrop();
        if(item.getType().equals(Material.FIREWORK_ROCKET)){

        }
    }


}
