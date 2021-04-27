package ru.ragnok123.brotherEye.common;

import java.util.*;

import lombok.Getter;
import lombok.Setter;
import ru.ragnok123.brotherEye.common.check.CheckManager;
import ru.ragnok123.brotherEye.common.storage.Storage;
import ru.ragnok123.brotherEye.common.storage.StorageManager;

public class BrotherEyeManager {
	
	private static BrotherEyeManager instance;
	public EventAdapter events;
	public CheckManager checks;
	private StorageManager storageManager = new StorageManager();
	private ArrayList<CheatPlayer> players = new ArrayList<CheatPlayer>();
	@Setter
	@Getter
	public StorageType storageType;
	
	public enum StorageType{
		CONFIG,
		MYSQL;
	}
	
	public Storage getStorage() {
		return storageManager.getStorage(storageType);
	}
	
	public static BrotherEyeManager get() {
		return instance;
	}
	
	public void setCheckManager(CheckManager mgr) {
		this.checks = mgr;
	}
	
	public void setEventAdapter(EventAdapter adapter) {
		this.events = adapter;
	}
	
	public void addPlayer(UUID uuid) {
		CheatPlayer p = new CheatPlayer(uuid);
		players.add(p);
	}
	
	public CheatPlayer getPlayer(UUID uuid) {
		for(CheatPlayer p : players) {
			if(p.getPlayer() == uuid) {
				return p;
			}
		}
		return null;
	}
	
	public void removePlayer(UUID uuid) {
		CheatPlayer p = getPlayer(uuid);
		players.remove(p);
	}
	
	
}