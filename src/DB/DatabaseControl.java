package DB;

public interface DatabaseControl {

	/**
	 * 
	 * @param sql
	 */
	abstract boolean savejob(string sql);

	/**
	 * 
	 * @param sql
	 */
	abstract string updateStatus(sting sql);

	/**
	 * 
	 * @param sql
	 */
	abstract timestamp arrivalTime(string sql);

	abstract void retrieve();

	abstract void store();

	abstract void restore();

	abstract void backup();

	abstract void connect();

	abstract void closeConnection();

	abstract boolean paymentReqest();

	abstract boolean returnRequest();

	/**
	 * 
	 * @param jobID
	 */
	void addJobs(string jobID);

	void removeJob();

	void updateJob();

	void seeJobHistory();

	boolean paymentReqest2();

	boolean returnRequest2();

	void paymentMethod();

	void seeCustomerHistory();

	void arrivalTime();

	static void DatabaseControl();

}