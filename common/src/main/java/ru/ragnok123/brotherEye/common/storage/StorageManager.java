package ru.ragnok123.brotherEye.common.storage;

import ru.ragnok123.brotherEye.common.BrotherEyeManager.StorageType;

import java.util.*;

public class StorageManager {
	
	private HashMap<StorageType, Storage> storages = new HashMap<StorageType, Storage>();
	
	public void registerStorage(StorageType type, Storage storage) {
		storages.put(type, storage);
	}
	
	public Storage getStorage(StorageType type) {
		return storages.get(type);
	}
	
}