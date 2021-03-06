package ru.ragnok123.brotherEye.common.check.impl;

import ru.ragnok123.brotherEye.common.Punishment;
import ru.ragnok123.brotherEye.common.check.Check;
import ru.ragnok123.brotherEye.common.data.player.PlayerMoveData;

public class FlyCheck implements Check<PlayerMoveData> {

	@Override
	public String getName() {
		return "Fly";
	}
	
	@Override
	public boolean handle(PlayerMoveData data) {
		if(data.toggleFly && data.isFlying) {
			return false;
		}
		return true;
	}
	
	@Override
	public int getMaxWarnings() {
		return 5;
	}
	
	@Override
	public Punishment getPunishment() {
		return Punishment.BAN;
	}

}
