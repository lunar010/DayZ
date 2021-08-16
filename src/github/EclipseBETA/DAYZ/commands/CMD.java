package github.EclipseBETA.DAYZ.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("dayz")){ 
			if (args.length >= 2) {
				if(args[0] == "reload") {
					
				} else if(args[0] == "help") {
					
				}
			} else {
				executor.sendMessage("EcipseBETA's DayZ");
				executor.sendMessage("Version: BETA 2 (1.16.5)");
				executor.sendMessage("Help: /dayz help");
			}
		}
		return false;
	}
}
