package github.EclipseBETA.DAYZ.listeners;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Chest implements Listener {

	public void onInteract(PlayerInteractEvent e) {
		if((e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_BLOCK) && (e.getClickedBlock().getType() == Material.CHEST)) {
			
		}
	}
	
}
