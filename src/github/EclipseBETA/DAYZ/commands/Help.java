package github.EclipseBETA.DAYZ.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import github.EclipseBETA.DAYZ.DAYZ;

public class Help implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private DAYZ plugin;
	
	public Help(DAYZ plugin) {
		this.plugin = plugin;
		plugin.getCommand("dayz").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("dayz")){ 
			if (args.length >= 2) {
				if(args[0] == "help") {
					executor.sendMessage(" ");
					executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
					executor.sendMessage("」e/help 」7-」f get helps");
					executor.sendMessage("」e/reload 」7-」f reload plugin");
					executor.sendMessage(" ");
				}
			} else {
				executor.sendMessage(" ");
				executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
				executor.sendMessage("」eVersion」7:」f 」6BETA 2 」7(1.16.5)");
				executor.sendMessage("」eHelp」7:」f 」c/dayz help");
				executor.sendMessage("」r」opowerd by projectEclipse");
				executor.sendMessage(" ");
			}
		}
		return false;
	}
}
