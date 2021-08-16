package github.EclipseBETA.DAYZ.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {
	/* ZOMBIE ITEMS */
	@EventHandler
	public void creatureSpawn(CreatureSpawnEvent e) {
		if (e.getEntityType() == EntityType.ZOMBIE) {
			int rand = getRandom(1,100);
			if (rand < 51) {
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				e.getEntity().getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.WOODEN_SWORD));
			} else if (rand < 81) {
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				e.getEntity().getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				e.getEntity().getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.WOODEN_SWORD));
			} else if (rand < 91) {
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				e.getEntity().getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				e.getEntity().getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
			} else if (rand < 96) {
				e.getEntity().getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				e.getEntity().getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				e.getEntity().getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
			} else if (rand < 100) {
				e.getEntity().getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				e.getEntity().getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				e.getEntity().getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				if(e.getEntityType() != EntityType.SKELETON)
					e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
			} else {
				e.getEntity().getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				e.getEntity().getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				e.getEntity().getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				e.getEntity().getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD)); 
			}
			
		}
	}
	
	public int getRandom(int lower, int upper) {
        Random random = new Random();
        return random.nextInt((upper - lower) + 1) + lower;
    }
}
