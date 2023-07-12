package DB;

import java.sql.ResultSet;

public interface I_DB_Connectivity {

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract ResultSet read(String sql, Connection conn);

	/**
	 * 
	 * @param sql
	 * @param conn
	 */
	abstract int write(String sql, Connection conn);

	/**
	 * 
	 * @param sql
	 */
	abstract Connection connect(String sql);

	/**
	 * 
	 * @param conn
	 */
	abstract ResultSet close(Connection conn);

}