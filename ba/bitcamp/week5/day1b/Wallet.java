package ba.bitcamp.week5.day1b;

public class Wallet {
	private int moneyAmount;
	private CreditCard[] cards;
	
	/**
	 * Makes free slots for the given amount of cards.
	 * @param totalCards - Max. cards this wallet can have.
	 */
	public Wallet(int totalCards) {
		cards = new CreditCard[cards.length];
		moneyAmount = 0;
	}
	
	/**
	 * Gets the current sum of money the wallet contains.
	 * @return The current wallet balance.
	 */
	public int getWalletBalance() {
		return moneyAmount;
	}
	
	/**
	 * Gets the amount of cards currently in the wallet.
	 * @return Integer representing the number of cards.
	 */
	public int getNumberOfCards() {
		int numOfCards = 0;
		
		while (numOfCards < cards.length && cards[numOfCards] == null) {
			numOfCards++;
		}
		
		return numOfCards;
	}
	
	/**
	 * Returns the credit card at the given index.
	 * @param index - Index of the credit card in the array.
	 * @return Credit Card to be returned.
	 */
	public CreditCard getCard(int index) {
		return cards[index];
	}
	
	/**
	 * Adds money to the wallet.
	 * @param amount Amount to add.
	 */
	public void addMoney(int amount) {
		moneyAmount += amount;
	}
	
	/**
	 * Deducts money from the wallet.
	 * Cannot go under zero.
	 * @param amount Amount to deduct.
	 */
	public void takeMoney(int amount) {
		if (moneyAmount - amount < 0) {
			throw new IllegalArgumentException();
		} else {
			moneyAmount -= amount;
		}
	}
	
	/**
	 * Adds a card to a free place in the wallet.
	 * If no such free space is there then a
	 * message is printed on the console.
	 * @param c Card to add to the wallet.
	 */
	public void addCard(CreditCard c) {
		int nextFreePlace = 0;
		
		try {
			while (cards[nextFreePlace] == null) {
				nextFreePlace++;
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No place for additional card.");
			return;
		}
		
		cards[nextFreePlace] = c;
	}
}
