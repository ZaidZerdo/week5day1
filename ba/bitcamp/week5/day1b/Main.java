package ba.bitcamp.week5.day1b;

public class Main {

	public static void main(String[] args) {
		Wallet w = new Wallet(2); // Novčanik sa 0 KM i 2 mjesta za kartice
		System.out.println(w.getWalletBalance()); // Isprinta 0 KM
		CreditCard c1 = new CreditCard(); // Napravi karticu sa 0 KM
		c1.addMoney(7900); // Dodati 7900 KM na karticu
		System.out.println(c1.getCardBalance()); // Isprinta 7900 KM
		w.addCard(c1); // Dodaj karticu u novčanik
		CreditCard c2 = new CreditCard();
		w.addCard(c2);
		CreditCard c3 = new CreditCard();
		w.addCard(c3); // Neće dodati karticu jer je max. 2 kartice
		// Pređi preko svih kartica u novčaniku i isprintaj sumu novca
		for (int i = 0; i < w.getNumberOfCards(); i++) {
			System.out.println(w.getCard(i).getCardBalance());
		}
	}

}
