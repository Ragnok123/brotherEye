package ru.ragnok123.brotherEye.jbserver;

import net.novatech.jbserver.plugin.java.JavaPlugin;
import net.novatech.jbserver.utils.Color;



public class BrotherEye extends JavaPlugin{
	
	public void onEnable() {
		getServer().getEventManager().registerEventListener(this, new PluginListener());
	}
	
	public static String getPrefix() {
		return Color.YELLOW + "[BrotherEye]";
	}
	
	public static String getPrefix(String color) {
		return getPrefix() + " §"+ color;
	}
	
}