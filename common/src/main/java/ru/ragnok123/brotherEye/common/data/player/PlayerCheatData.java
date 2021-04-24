package ru.ragnok123.brotherEye.common.data.player;

import java.util.UUID;

import ru.ragnok123.brotherEye.common.data.CheatData;

public abstract class PlayerCheatData extends CheatData {
	
	private UUID player;
	
	public UUID getPlayer() {
		return this.player;
	}
	
	public PlayerCheatData(UUID player) {
		this.player = player;
	}
	
}