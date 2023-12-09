package at.leddis08.my_first_mc_plugin;

import at.leddis08.my_first_mc_plugin.commands.DoCommand;
import at.leddis08.my_first_mc_plugin.commands.GamemodeCommand;
import at.leddis08.my_first_mc_plugin.commands.TestCommand;
import at.leddis08.my_first_mc_plugin.listeners.BlockListeners;
import at.leddis08.my_first_mc_plugin.listeners.ConnectionListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class My_first_mc_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
        getCommand("do").setExecutor(new DoCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ConnectionListeners(), this);
        pluginManager.registerEvents(new BlockListeners(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
