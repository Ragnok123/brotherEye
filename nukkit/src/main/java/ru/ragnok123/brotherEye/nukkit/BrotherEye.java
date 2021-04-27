package ru.ragnok123.brotherEye.nukkit;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class BrotherEye extends PluginBase{
	
	public void onEnable() {
		
	}
	
	public static String getPrefix() {
		return TextFormat.GOLD + "[BrotherEye]";
	}
	
	public static String getPrefix(String color) {
		return getPrefix() + " §"+ color;
	}
	
}