import java.util.*;

public class App {

	public static void main(String[] args) {
		//Create deck
		Deck deck = new Deck();
		
		//Get player's names
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Player 1's name: ");
		String p1 = sc.next();
		System.out.println("Please enter Player 2's name: ");
		String p2 = sc.next();
		Player player1 = new Player(p1);
		Player player2 = new Player(p2);
		
		
		deck.shuffle();
		
		//Deal cards to player
		for (int i = 1; i <= 52; i++) {
			if (i % 2 != 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		//Player's flip their cards
		for(int i = 1; i <= 26; i++) {
			Card player1Card = (Card) player1.flip();
			Card player2Card = (Card) player2.flip();
			
			System.out.println(player1.name + "'s card: " + player1Card.getName());
			System.out.println(player2.name + "'s card: " + player2Card.getName());
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			}
			
			System.out.println(player1.name + ": " + player1.score + " | " + player2.name + ": " + player2.score);
		}
		
		//Determine winner
		if(player1.score > player2.score) {
			System.out.println(player1.name + " wins!");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " wins!");
		}else {
			System.out.println("Draw!");
		}
		
		
	}

}
