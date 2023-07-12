package DB;

import java.sql.ResultSet;

public class DBConnectivity implements I_DB_Connectivity {

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public ResultSet read(String sql, Connection conn) {
		// TODO - implement DBConnectivity.read
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	public int write(String sql, Connection conn) {
		// TODO - implement DBConnectivity.write
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public Connection connect(String sql) {
		// TODO - implement DBConnectivity.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param conn
	 */
	public ResultSet close(Connection conn) {
		// TODO - implement DBConnectivity.close
		throw new UnsupportedOperationException();
	}

	public static void DBConnectivity() {
		// TODO - implement DBConnectivity.DBConnectivity
		throw new UnsupportedOperationException();
	}

}