package ru.ragnok123.brotherEye.jbserver;

import net.novatech.jbserver.event.EventListener;
import net.novatech.jbserver.event.player.PlayerLoginEvent;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.player.PlayerInfo;
import ru.ragnok123.brotherEye.common.BrotherEyeManager;

public class PluginListener extends EventListener {

	private JBEventAdapter eventAdapter;
	
	public PluginListener() {
		this.eventAdapter = new JBEventAdapter();
	}
	
	@Override
	public void registerEventHandlers() {
		registerEventHandler(PlayerLoginEvent.class, ev -> {
			PlayerLoginEvent e = (PlayerLoginEvent) ev;
			
			PlayerInfo p = e.getPlayerInfo();
			BrotherEyeManager.get().addPlayer(p.getUniqueId());
			
		});
	}

}
