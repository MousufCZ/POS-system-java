package Payment;

import BAPERS.Processing.*;

public class Payment {

	Job staff;
	private string amount;
	private boolean paid;
	private string typeOfPayment;
	private boolean tenthOfCalendarMonth;
	private string latePaymentNotification;
	private boolean directDebit;

	/**
	 * 
	 * @param connectPaymentDatabase
	 */
	public boolean processingPayment(boolean connectPaymentDatabase) {
		// TODO - implement Payment.processingPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param calculateAmount
	 * @param paymentMethod
	 */
	public boolean pay(string calculateAmount, string paymentMethod) {
		// TODO - implement Payment.pay
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paymentSuccessful
	 */
	public boolean acceptPayment(booelan paymentSuccessful) {
		// TODO - implement Payment.acceptPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param paymentAmountIsTotal
	 */
	public boolean isPaymentFull(boolean paymentAmountIsTotal) {
		// TODO - implement Payment.isPaymentFull
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param threeHourUrgency
	 * @param lessThenThreeHourUrgency
	 */
	public string urgencyType(string threeHourUrgency, sting lessThenThreeHourUrgency) {
		// TODO - implement Payment.urgencyType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param typeOfPayment
	 * @param last4Digit
	 * @param expiryDate
	 */
	public void storeCardPayment(double amount, string typeOfPayment, int last4Digit, string expiryDate) {
		// TODO - implement Payment.storeCardPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param paid
	 * @param typeOfPayment
	 * @param tenthOfCalendarMonth
	 * @param directDebit
	 */
	public static void Payment(string amount, boolean paid, string typeOfPayment, boolean tenthOfCalendarMonth, boolean directDebit) {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

}