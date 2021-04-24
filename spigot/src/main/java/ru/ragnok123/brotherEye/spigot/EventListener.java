package ru.ragnok123.brotherEye.spigot;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import ru.ragnok123.brotherEye.common.BrotherEyeManager;
import ru.ragnok123.brotherEye.common.CheatPlayer;
import ru.ragnok123.brotherEye.common.EventAdapter;
import ru.ragnok123.brotherEye.common.data.player.PlayerMoveData;

public class EventListener extends EventAdapter implements Listener {
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		Player player = e.getPlayer();
		BrotherEyeManager.get().addPlayer(player.getUniqueId());
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		UUID uid = p.getUniqueId();
		
		PlayerMoveData data = new PlayerMoveData(uid);
		data.x = e.getFrom().getX();
		data.y = e.getFrom().getY();
		data.z = e.getFrom().getZ();
		
		data.xNew = e.getTo().getX();
		data.yNew = e.getTo().getY();
		data.zNew = e.getTo().getZ();
		
		data.toggleFly = p.getAllowFlight();
		
		sendData(data);
		
	}

	@Override
	public void handleViolation(CheatPlayer p, String cause) {
		Player player = Bukkit.getPlayer(p.getPlayer());
		
	}
	
}