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
		if (cmd.getName().equalsIgnoreCase("dayz")){ 
			if (args.length > 0) {
				if(args[0].equalsIgnoreCase("help")) {
					executor.sendMessage(" ");
					executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
					executor.sendMessage("」a/dayz help 」7-」8 get helps");
					executor.sendMessage("」4/dayz heal 」7-」8 get heals (dayz.heal)");
					executor.sendMessage("$4/dayz cci 」7-」8 create custom items (dayz.cci)");
					executor.sendMessage("」4/dayz reload 」7-」8 reload plugin (dayz.reload)");
					executor.sendMessage(" ");
				}
			} else {
				executor.sendMessage(" ");
				executor.sendMessage("」6EcipseBETA's 」4」lDayZ」r");
				executor.sendMessage("」eVersion」7:」f 」6BETA 2 」7(1.16.5)");
				executor.sendMessage("」eHelp」7:」f 」c/dayz help");
				executor.sendMessage(" ");
			}
		}
		return true;
	}
}
