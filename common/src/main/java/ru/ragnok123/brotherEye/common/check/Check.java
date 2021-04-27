package ru.ragnok123.brotherEye.common.check;

import ru.ragnok123.brotherEye.common.Punishment;
import ru.ragnok123.brotherEye.common.data.CheatData;

public interface Check<T extends CheatData>{
	
	String getName();
	/*
	 * if returns true then is violated
	 */
	boolean handle(T data);
	int getMaxWarnings();
	Punishment getPunishment();
}