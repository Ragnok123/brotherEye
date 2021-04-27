package ru.ragnok123.brotherEye.spigot;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class BrotherEye extends JavaPlugin{
	
	public void onEnable() {
		
	}
	
	public static String getPrefix() {
		return ChatColor.GOLD + "[BrotherEye]";
	}
	
	public static String getPrefix(String color) {
		return getPrefix() + " §"+ color;
	}
	
}