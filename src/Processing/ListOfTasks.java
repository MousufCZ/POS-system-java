package Processing;

public class ListOfTasks {

	private static int numberOfTasks;

	public void listOfTasks() {
		// TODO - implement ListOfTasks.listOfTasks
		throw new UnsupportedOperationException();
	}

	/**
	 * As image technology improves, it is expected that new processes will become available, requiring the installation of
	 * new equipment and an increase in the number of standard tasks. Thus, BAPERS must offer functionality for adding
	 * new tasks, and removing or updating the existing tasks.
	 * @param taskID
	 * @param taskDetail
	 * @param discount
	 * @param customerID
	 */
	public string addTask(string taskID, string taskDetail, boolean discount, string customerID) {
		// TODO - implement ListOfTasks.addTask
		throw new UnsupportedOperationException();

		for (new task){
			generate new taskID;
			save new task in DB
		}
	}

	/**
	 * BAPERS staff can request to remove a task
	 * @param taskID
	 */
	public void removeTask(string taskID) {
		// TODO - implement ListOfTasks.retrieveTask
		throw new UnsupportedOperationException();

		if (taskID search){
			remove taskID from database;
		}
	}


	/**
	 *
	 * @param taskID
	 */
	public void updateTask(string taskID) {
		// TODO - implement ListOfTasks.retrieveTask
		throw new UnsupportedOperationException();

		if(taskID){
			make task updates;
			input in a text box what the task update is;
			store information on db;
		}
	}


	/**
	 * Use JobID to check the status of the current job, which will cover the status of task?
	 * @param taskID
	 */
	public void retrieveTask(string taskID) {
		// TODO - implement ListOfTasks.retrieveTask
		throw new UnsupportedOperationException();

		retrieve taskID;
		print System.out.println("Current taskID number is:" + taskID + ".");
	}

	/**
	 * 
	 * @param numberOfTasks
	 */
	public static void ListOfTasks(int numberOfTasks) {
		// TODO - implement ListOfTasks.ListOfTasks
		throw new UnsupportedOperationException();
	}

}