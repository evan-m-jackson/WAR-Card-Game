import java.util.*;

public class Player {
	private List<Card> hand = new ArrayList<>();
	public int score;
	public String name;
	
	public Player(String name) {
		super();
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + "'s hand: ");
		for (Card card: hand) {
			card.describe(card.getName());
		}
	}
	
	public Object flip() {
		return this.hand.remove(0);
	}
	
	public void draw(Deck deck) {
		Card newCard = (Card) deck.draw();
		hand.add(newCard);
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	
}
