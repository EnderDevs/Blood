package com.enderdevs.blood;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Blood extends JavaPlugin {

	@Override
	public void onEnable(){

		Bukkit.getPluginManager().registerEvents(new Listener(){

			@EventHandler
			public void onPvP(EntityDamageByEntityEvent e){
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, blood(e.getEntity().getType()));
			}

		}, this);

	}
	
	private int blood(EntityType type)
	  {
	    switch (type)
	    {
	    case COMPLEX_PART: 
	    case MINECART: 
	    case MINECART_CHEST: 
	    case WITHER_SKULL: 
	      return 152;
	    case ENDER_DRAGON: 
	    case IRON_GOLEM: 
	    case MINECART_MOB_SPAWNER: 
	    case PRIMED_TNT: 
	      return 155;
	    case ENDER_CRYSTAL: 
	    case SKELETON: 
	      return 152;
	    case WITCH: 
	      return 49;
	    case ENDER_PEARL: 
	      return 133;
	    case SMALL_FIREBALL: 
	      return 41;
	    case SPIDER: 
	      return 42;
	    case CHICKEN: 
	      return 99;
	    default: return 152;
	    }
	  }

}
