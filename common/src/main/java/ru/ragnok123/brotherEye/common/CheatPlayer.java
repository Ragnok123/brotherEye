package ru.ragnok123.brotherEye.common;

import java.util.UUID;

public class CheatPlayer {
	
	private UUID uuid;
	public long groundTime;
	public int warnings = 0;
	
	public CheatPlayer(UUID uuid) {
		this.uuid = uuid;
		BrotherEyeManager.get().getStorage().initPlayer(this);
	}
	
	public UUID getPlayer() {
		return this.uuid;
	}
	
}