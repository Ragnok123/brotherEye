package ru.ragnok123.brotherEye.jbserver;

import net.novatech.jbserver.event.*;
import net.novatech.jbserver.event.player.PlayerLoginEvent;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.player.PlayerInfo;
import ru.ragnok123.brotherEye.common.BrotherEyeManager;

public class PluginListener implements EventListener {

	private JBEventAdapter eventAdapter;
	
	public PluginListener() {
		this.eventAdapter = new JBEventAdapter();
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		PlayerInfo p = e.getPlayerInfo();
		BrotherEyeManager.get().addPlayer(p.getUniqueId());
	}
	
}
