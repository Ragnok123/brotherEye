package ru.ragnok123.brotherEye.common.data.player;

import java.util.UUID;

import ru.ragnok123.brotherEye.common.data.CheatProtocol;

public class PlayerMoveData extends PlayerCheatData{

	public double x;
	public double y;
	public double z; 
	
	public double xNew;
	public double yNew;
	public double zNew;
	
	public boolean ground;
	public long groundTime;
	
	public boolean toggleFly;
	public boolean isFlying;
	
	public boolean teleported;
	
	public PlayerMoveData(UUID player) {
		super(player);
	}
	
	public int getId() {
		return CheatProtocol.PLAYER_MOVE_DATA;
	}

}