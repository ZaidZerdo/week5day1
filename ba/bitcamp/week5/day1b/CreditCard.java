package ba.bitcamp.week5.day1b;

public class CreditCard {
	private int cardNumber;
	private String bank;
	private int expirationMonth;
	private int expirationYear;
	private int accountBalance = 0;
	
	/**
	 * Adds money to the account balance.
	 * @param money Amount to add.
	 */
	public void addMoney(int money) {
		accountBalance += money;
	}
	
	/**
	 * Deducts money from the account balance.
	 * @param money Money to deduct.
	 */
	public void deductMoney(int money) {
		accountBalance -= money;
	}
	
	/**
	 * Gets the current sum of money on the account.
	 * @return The current account balance.
	 */
	public int getCardBalance() {
		return accountBalance;
	}
}
