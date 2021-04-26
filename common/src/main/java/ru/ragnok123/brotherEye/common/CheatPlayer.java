package ru.ragnok123.brotherEye.common;

import java.util.UUID;

public class CheatPlayer {
	
	private UUID uuid;
	public long groundTime;
	
	public CheatPlayer(UUID uuid) {
		this.uuid = uuid;
	}
	
	public UUID getPlayer() {
		return this.uuid;
	}
	
}