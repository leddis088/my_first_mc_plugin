package at.leddis08.my_first_mc_plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!");
            return false;
        }

        Player player = (Player) commandSender;
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("one")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + "Du bist nun im Creative mode!");
            }else if (args[0].equalsIgnoreCase("two")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + "Du bist nun im Survival mode!");
            }else {
                commandSender.sendMessage(ChatColor.RED + "Usage /do one|two");
            }
        }else {
            commandSender.sendMessage(ChatColor.RED + "Usage /do one|two");
        }
        return false;
    }
}
