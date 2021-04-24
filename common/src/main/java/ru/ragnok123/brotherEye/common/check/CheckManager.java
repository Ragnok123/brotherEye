package ru.ragnok123.brotherEye.common.check;

import java.util.HashMap;

public class CheckManager {
	
	public enum CheckType {
		FLY(1), // move
		SPEED(2), // move
		
		KILLAURA(3), // combat
		REACH(4), // combat
		
		FAST_BREAK(5), // blocks
		PHASE_BREAK(6); // blocks
		
		CheckType(int id) {
			this.id = id;
		}
		
		private int id;
		public int getId() {
			return this.id;
		}
	}
	
	private HashMap<CheckType, Check> checks = new HashMap<CheckType, Check>();
	
	public void registerCheck(CheckType type, Check check) {
		this.checks.put(type,check);
	}
	
	public Check getCheck(CheckType type) throws NullPointerException{
		return checks.get(type);
	}
	
}