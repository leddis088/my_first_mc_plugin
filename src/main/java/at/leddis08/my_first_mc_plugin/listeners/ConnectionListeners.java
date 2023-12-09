package at.leddis08.my_first_mc_plugin.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class ConnectionListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.GREEN + "hat das Spiel betreten!");
        player.getInventory().addItem(new ItemStack(Material.APPLE));
    }
    @EventHandler
    public void onLeft(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.RED + "hat das Spiel verlassen!");
    }

}
