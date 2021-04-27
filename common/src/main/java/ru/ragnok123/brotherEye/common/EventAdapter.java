package ru.ragnok123.brotherEye.common;

import ru.ragnok123.brotherEye.common.check.Check;
import ru.ragnok123.brotherEye.common.check.CheckManager;
import ru.ragnok123.brotherEye.common.check.CheckManager.CheckType;
import ru.ragnok123.brotherEye.common.check.impl.*;
import ru.ragnok123.brotherEye.common.data.CheatData;
import ru.ragnok123.brotherEye.common.data.CheatProtocol;
import ru.ragnok123.brotherEye.common.data.player.PlayerMoveData;

public abstract class EventAdapter{
	
	public void sendData(CheatData data) {
		CheckManager mgr = BrotherEyeManager.get().checks;
		
		switch(data.getId()) {
		case CheatProtocol.PLAYER_MOVE_DATA:
			PlayerMoveData move = (PlayerMoveData)data;
			
			FlyCheck fly = (FlyCheck) mgr.getCheck(CheckType.FLY);
			if(fly.handle(move)) {
				handleViolation(BrotherEyeManager.get().getPlayer(move.getPlayer()), fly);
			}
			break;
		}
	}
	
	private void handleViolation(CheatPlayer p, Check check) {
		Punishment punishment = Punishment.WARNING;
		if(p.warnings >= check.getMaxWarnings()) {
			punishment = check.getPunishment();
		}
		handleViolation(p, check.getName(), punishment);
	}
	
	public abstract void handleViolation(CheatPlayer p, String cause, Punishment punishment);
	
}