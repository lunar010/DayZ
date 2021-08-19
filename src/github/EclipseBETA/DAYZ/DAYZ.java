package github.EclipseBETA.DAYZ;

import org.bukkit.plugin.java.JavaPlugin;

import github.EclipseBETA.DAYZ.commands.Help;
import github.EclipseBETA.DAYZ.commands.Reload;
import github.EclipseBETA.DAYZ.listeners.Clicks;
import github.EclipseBETA.DAYZ.listeners.Listeners;

public class DAYZ extends JavaPlugin {
	
	private static DAYZ instance;
	
	public static DAYZ getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		System.out.println("Registering commands, listeners");
		instance = this;
		new Help(this);
		new Reload(this);
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		getServer().getPluginManager().registerEvents(new Clicks(), this);
	}
	
	@Override
	public void onDisable() {
		instance = null; 
	}
}
