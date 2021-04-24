package ru.ragnok123.brotherEye.common.check;

import java.util.HashMap;

public class CheckManager {
	
	public enum CheckType {
		FLY(1),
		SPEED(2),
		
		KILLAURA(3),
		REACH(4),
		
		FAST_BREAK(5),
		PHASE_BREAK(6);
		
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