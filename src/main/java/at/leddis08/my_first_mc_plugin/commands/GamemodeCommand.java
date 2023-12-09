package at.leddis08.my_first_mc_plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        Player player = (Player) commandSender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + "Du bist nun im Creative mode!");
            }else if (args[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + "Du bist nun im Survival mode!");
            }else if (args[0].equalsIgnoreCase("3")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.GREEN + "Du bist nun im Spectator mode!");
            }else {
                commandSender.sendMessage(ChatColor.RED + "Usage /gm <1|2|3>");
            }
        }else {
            commandSender.sendMessage(ChatColor.RED + "Usage /gm <1|2|3>");
        }
        return false;
    }
}
