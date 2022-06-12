import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Object> cards = new ArrayList<>();
	private String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
	private String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	public Deck() {
		super();
		
		for (String suit : suits) {
			for (int i = 0; i < values.length; i++) {
				Card card = new Card();
				card.setValue(i + 2);
				card.setName(values[i] + " of " + suit);
				cards.add(card);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Object draw() {
		return this.cards.remove(0);
	}
}
