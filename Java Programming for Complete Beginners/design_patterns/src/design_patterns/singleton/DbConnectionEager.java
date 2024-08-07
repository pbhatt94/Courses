package design_patterns.singleton;

public class DbConnectionEager {
	private static DbConnectionEager connection = new DbConnectionEager();

	private DbConnectionEager() {

	}

	public static DbConnectionEager getInstance() {
		return connection;
	}
}
