package ru.ragnok123.brotherEye.common.storage;

import ru.ragnok123.brotherEye.common.CheatPlayer;
import ru.ragnok123.brotherEye.common.utils.SQLConstants;
import ru.ragnok123.sqlNukkitLib.Database;
import ru.ragnok123.sqlNukkitLib.mysql.MySQLConnectionInfo;
import ru.ragnok123.sqlNukkitLib.mysql.MySQLDatabase;
import ru.ragnok123.sqlNukkitLib.utils.Pair;

public class SQLStorage extends Storage {

	private Database database;
	
	@Override
	public void initStorage() {
		database = new MySQLDatabase(new MySQLConnectionInfo(
				SQLConstants.HOST,
				SQLConstants.USER,
				SQLConstants.PASSWORD,
				SQLConstants.DATABASE,
				SQLConstants.PORT
				));
		database.connect();

	}

	@Override
	public void initPlayer(CheatPlayer p) {
		database.select("brother_eye", "player", p.getPlayer().toString(), map -> {
			if(!map.isEmpty()) {
				
			} else {
				database.insert("brother_eye", new Pair[] {
						new Pair("player", p.getPlayer())
				});
			}
		});
	}

}
