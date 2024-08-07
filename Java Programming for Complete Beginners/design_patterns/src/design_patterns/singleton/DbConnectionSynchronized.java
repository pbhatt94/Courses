package design_patterns.singleton;

public class DbConnectionSynchronized {
	private static DbConnectionSynchronized dbConnection;

	private DbConnectionSynchronized() {

	}

	synchronized public static DbConnectionSynchronized getInstance() {
		if (dbConnection == null) {
			dbConnection = new DbConnectionSynchronized();
		}
		return dbConnection;
	}
}
