package io.github.Ajetski.AjetCraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class AjetCraftPlugin extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("AjetCraft enabled...");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("ping")) {
            sender.sendMessage("Pong!");
            return true;
        }
        return false;
    }

    @Override
    public void onDisable(){
        getLogger().info("AjetCraft disabled...");
    }
}
