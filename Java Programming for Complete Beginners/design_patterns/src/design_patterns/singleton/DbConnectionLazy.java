package design_patterns.singleton;

public class DbConnectionLazy {
	private static DbConnectionLazy dbConnection;

	private DbConnectionLazy() {

	}

	public static DbConnectionLazy getInstance() {
		if (dbConnection == null) {
			dbConnection = new DbConnectionLazy();
		}
		return dbConnection;
	}
}
