package github.EclipseBETA.DAYZ.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import github.EclipseBETA.DAYZ.DAYZ;

public class Reload implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private DAYZ plugin;
	
	public Reload(DAYZ plugin) {
		this.plugin = plugin;
		plugin.getCommand("dayz").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("dayz")) {
			if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
				if(executor.hasPermission("dayz.reload")){
					executor.sendMessage(" ");
					executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
					executor.sendMessage("」aSuccesfully reloaded plugin");
					executor.sendMessage(" ");
				} else {
					executor.sendMessage(" ");
					executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
					executor.sendMessage("」4You don't have permission");
					executor.sendMessage(" ");
				}
			}
		}
		return true;
	}
}
