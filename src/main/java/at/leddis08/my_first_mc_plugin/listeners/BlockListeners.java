package at.leddis08.my_first_mc_plugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.jetbrains.annotations.NotNull;

public class BlockListeners implements Listener {

   @EventHandler(ignoreCancelled = true)
   public void onBlockBreak(BlockBreakEvent event) {
        if (!(event.getPlayer().getGameMode().equals(GameMode.CREATIVE))){
            event.setCancelled(true);
        }
   }
   @EventHandler(ignoreCancelled = true)
   public void onBlockPlace(BlockPlaceEvent event) {
       if (!(event.getPlayer().getGameMode().equals(GameMode.CREATIVE))){
           event.setCancelled(true);
       }
   }

}
