package ru.ragnok123.brotherEye.jbserver;

import cn.nukkit.event.Listener;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.server.Server;
import net.novatech.jbserver.utils.Color;

import java.util.UUID;

import ru.ragnok123.brotherEye.common.BrotherEyeManager;
import ru.ragnok123.brotherEye.common.CheatPlayer;
import ru.ragnok123.brotherEye.common.EventAdapter;
import ru.ragnok123.brotherEye.common.Punishment;
import ru.ragnok123.brotherEye.common.data.player.PlayerMoveData;

public class JBEventAdapter extends EventAdapter{


	@Override
	public void handleViolation(CheatPlayer p, String cause, Punishment punishment) {
		Player player = Server.getInstance().getFactoryManager().getPlayerFactory().getPlayerByUUID(p.getPlayer());
		switch(punishment) {
		case WARNING:
			player.sendMessage(BrotherEye.getPrefix("c") + "Warning, you are suspicious with cheating with " + Color.CYAN + cause);
			break;
		case KICK:
			player.close(BrotherEye.getPrefix() + "\n" + Color.RED + "You were kicked for " + Color.CYAN + cause);
			break;
		case BAN:
			player.close(BrotherEye.getPrefix() + "\n" + Color.RED + "You were banned for " + Color.CYAN + cause);
			break;
		}
		
	}
	
}