package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	private static final String DEFAULT_DB = "mysql";

	public static DBConnection getConnection(String db) throws IllegalArgumentException {
		switch (db) {
		case "mysql":
			return new MySQLConnection();
		case "mongodb":
			//return MongoDBConnection.getInstance();
			return null;
		default:
			throw new IllegalArgumentException("Invalid db " + db);
		}
	}
	
	public static DBConnection getConnection() throws IllegalArgumentException {
		return getConnection(DEFAULT_DB);
	}
}
