package Customer;

import java.util.*;

public class Customers {

	Collection<ValuedCustomer> valuedCustomers;
	private String valuedCaustomer;
	private int customerID;
	private String name;

	/**
	 * 
	 * @param customerID
	 */
	public void upgrade(int customerID) {
		// TODO - implement Customers.upgrade
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 */
	public void downgrade(int customerID) {
		// TODO - implement Customers.downgrade
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 */
	public void setID(int customerID) {
		// TODO - implement Customers.setID
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement Customers.getID
		throw new UnsupportedOperationException();

		access database to get valid customerID;

	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean isValuedCustomer() {
		// TODO - implement Customers.isValuedCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 * @param name
	 */
	public static void createCustomer(int customerID, String name) {
		// TODO - implement Customers.createCustomer
		throw new UnsupportedOperationException();
	}

}