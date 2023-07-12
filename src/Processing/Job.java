package Processing;

request access to customer

import BAPERS.DB.*;
import BAPERS.Customer.*;

public class Job implements DatabaseControl {

	private int jobID;
	private string jobLocation;
	private string priority;
	private float normalUrgent = 24;
	private float sixHourUrgent = 6;
	private float threeHourUrgent = 3;			// 100% surcharge
	private float lessThenThreeHourUrgent;		//Less then 3 hours at higher rate
	private timestamp deadline;
	private string specialInstructions;
	private string status;
	private timestamp expectedTime;
	private String outstandingTask;
	private Customers customerAccount;
	private int maximumNumberOfJobs = 30;
	private int currentNumberOfJobs;

	public void setJobLocation(string jobLocation) {
		this.jobLocation = jobLocation;
	}

	/**
	 * 
	 * @param automaticAssignment
	 */
	public void assignJobID(String automaticAssignment) {
		// TODO - implement Job.assignJobID
		throw new UnsupportedOperationException();
	}

	/**
	 * At present, BIPL technicians can perform around 30 standard tasks,
	 * each of which has an identifier,
	 * and is carried out at a particular processing station or location within the laboratory
	 * @param jobDescription
	 * @param priority
	 */
	public void acceptJob(string jobDescription, string priority) {
		// TODO - implement Job.acceptJob
		throw new UnsupportedOperationException();

		string p =

		for (new jobs){
			add job;
			currentNumberOfJobs++;
			call generate new job id;
			call placeJob(JobLocation, priority, jobStatus);
			call job priority;

			return ;

		}
	}

	/**
	 * 
	 * @param jobLocation
	 * @param priority
	 * @param jobStatus
	 */
	public string placeJob(string jobLocation, string priority, String jobStatus) {
		// TODO - implement Job.placeJob
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param priority
	 * @param urgency
	 */
	public string calculateDiscount(string priority, String urgency) {
		// TODO - implement Job.calculateDiscount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param totalAmount
	 */
	public void deductAmount(string totalAmount) {
		// TODO - implement Job.deductAmount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taskProcessed
	 */
	public boolean completed(boolean taskProcessed) {
		// TODO - implement Job.completed
		throw new UnsupportedOperationException();

	}

	/**
	 * 
	 * @param saveJobStatus
	 */
	public void stored(string saveJobStatus) {
		// TODO - implement Job.stored
		throw new UnsupportedOperationException();

	}

	/**
	 * Each job is given a unique identifier on receipt, and assigned urgency
	 * level. Urgent jobs must be completed within 6 hours, while the normal jobs within 24 hours. But, the customer may
	 * stipulate a deadline for completion of 3 hours (at 100% surcharge) or shorter (at an even higher rate).
	 * @param urgent
	 * @param high
	 * @param medium
	 * @param low
	 */
	public string setPriority(string priotiy, float urgent, float sixHourUrgent, float threeHourUrgent, float lessThenThreeHourUrgent) {
		// TODO - implement Job.setPriority
		throw new UnsupportedOperationException();

	}


	/**
	 * 
	 * @param previousJobLocation
	 * @param specificJobLocation
	 */
	public void returnJobs(string previousJobLocation, string specificJobLocation) {
		// TODO - implement Job.returnJobs
		throw new UnsupportedOperationException();
		retrieve job info from database;

		System.out.println("The current location of the job in the lab is: " + getJobLocation() + ".");
		System.out.println("The current status of the job is: " + jobStatus() +
				", and it is expected to take and estimate of: " + estimatedCompletionTime() + ".";);

		return;
	}

	/**
	 * Once a task is completed, the semi- or fully-completed job is placed in a given location
	 * from where it can be collected
	 * for further processing or dispatched to the customer.
	 * BAPERS staff can select the jobStatus from a drop down selection
	 * @param notStarted
	 * @param inProgress
	 * @param completed
	 * @param highUrgency
	 */
	public string jobStatus(String notStarted, String inProgress, String completed, String highUrgency) {
		// TODO - implement Job.jobStatus
		throw new UnsupportedOperationException();

		boolean started;

		if(jobID == notStarted || and jobs is <= maximumNumberOfJobs){
			start job;
			print System.out.println("JobID number: " + jobID + " has started to process.");
			// has job started??
			if(jobID started = true){
				jobID == inProgress;
			}
		}
		else if(jobID == inProgress){
			print System.out.println("JobID number: " + jobID + " is currently in progress");
		}
		else if(jobID == completed){
			print System.out.println("JobID number: " + jobID + " has completed and awaiting to be picked up at " + jobLocation);
		}
		else(){
			jobID = setPriority(high);
		}
	}

	/**
	 * 
	 * @param jobCompletionTime
	 */
	public void recordDeadline(int jobCompletionTime) {
		// TODO - implement Job.recordDeadline
		throw new UnsupportedOperationException();
	}

	/**
	 * Each job is given a unique identifier on receipt, and assigned urgency
	 * level. Urgent jobs must be completed within 6 hours, while the normal jobs within 24 hours. But, the customer may
	 * stipulate a deadline for completion of 3 hours (at 100% surcharge) or shorter (at an even higher rate).
	 * @param jobLocation
	 * @param jobPriority
	 * @param jobStatus
	 * @param urgency
	 */
	public void estimatedCompletionTime(sting jobLocation, string jobPriority, string jobStatus, float urgent, float sixHourUrgent, float threeHourUrgent, float lessThenThreeHourUrgent)) {
		// TODO - implement Job.estimatedCompletionTime
		throw new UnsupportedOperationException();

		//if staff selects less then 3 hours, insert completion time
		if (staff selects == lessThenThreeHourUrgent){
			// Creating BuferedReader Object
			// InputStreamReader converts bytes to
			// stream of character
			BufferedReader numberOfHours = new
					BufferedReader(new InputStreamReader(System.in));

			// Asking for input from user
			System.out.println("Enter how long until completion : ");

			// Float reading internally
			int float_value = Float.parseFloat(numberOfHours.readLine());

			// Printing String
			System.out.println("The job ID number : "+ jobID);

			//Printing Integer
			System.out.println("will take : "+ float_value + " hours.");
		}

		2 hours'
	'	200% per hour
			number of hours = normally per hours * 200%=
				final cost



	}

	/**
	 * 
	 * @param copyRoom
	 * @param darkRoom
	 * @param developmentArea
	 * @param printingRoom
	 * @param finishingRoom
	 * @param packingDepartment
	 */
	public string getJobLocation(String copyRoom, String darkRoom, String developmentArea, String printingRoom, String finishingRoom, String packingDepartment) {
		return this.jobLocation;
	}

	/**
	 * using the parameters, set job location
	 * BAPERS staff are able to use dropdown selection for where the job is
	 * @param jobLocation
	 * @param copyRoom
	 * @param darkRoom
	 * @param developmentArea
	 * @param printingRoom
	 * @param finishingRoom
	 * @param packingDepartment
	 */
	public void setJobLocation(string jobLocation, string copyRoom, string darkRoom, string developmentArea, string printingRoom, string finishingRoom, string packingDepartment) {
		// TODO - implement Job.setJobLocation
		throw new UnsupportedOperationException();

		set selected location as string currentLocation;

		return;
		System.out.println("Current location of job is " + currentLocation + ".");
	}

	/**
	 * 
	 * @param jobID
	 * @param jobLocation
	 * @param priority
	 * @param threeHourUrgent
	 * @param lessThanThreeHourUrgency
	 * @param deadline
	 * @param specialInstructions
	 * @param status
	 * @param expectedTime
	 */
	public static void Job(int jobID, string jobLocation, string priority, string threeHourUrgent, string lessThanThreeHourUrgency, timestamp deadline, string specialInstructions, string status, timestamp expectedTime) {
		// TODO - implement Job.Job
		throw new UnsupportedOperationException();
	}

}