package tsp.hexchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tsp.hexchat.command.Command_hexchat;
import tsp.hexchat.listener.ChatListener;

public class HexChat extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getCommand("hexchat").setExecutor(new Command_hexchat());

        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);


    }

}
