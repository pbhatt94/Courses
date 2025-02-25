package design_patterns.singleton;

public class DbConnectionDoubleLock {
	private static DbConnectionDoubleLock dbConnection;

	private DbConnectionDoubleLock() {

	}

	public static DbConnectionDoubleLock getInstance() {
		if (dbConnection == null) {
			synchronized (DbConnectionDoubleLock.class) {
				if (dbConnection == null) {
					dbConnection = new DbConnectionDoubleLock();
				}
			}
		}
		return dbConnection;
	}
}
