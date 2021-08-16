package github.EclipseBETA.DAYZ;

import org.bukkit.plugin.java.JavaPlugin;

import github.EclipseBETA.DAYZ.listeners.Listeners;

public class DAYZ extends JavaPlugin {
	
	private static DAYZ instance;
	
	public static DAYZ getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
	@Override
	public void onDisable() { instance = null; }
}
