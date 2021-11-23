/* 
	Rony Pulickal Shaji C0816839
	
*/
import java.util.*;
class MainApplication{
	// think about your Method Choreography
	public static void main(String[] args)
	{
		FizbinGame game = new FizbinGame();
		// game.InitializeGame();
		// setup database connection
		// generate players 
	}
	
}

class FizbinGame{
	CardDeck gameDeck;

	public void InitializeGame() {
		gameDeck = new CardDeck();
	}
}		

class Card{
	public String suite;
	public int value;
}

class Player{
	public String name;
	ArrayList<Card> CardsInHand = new ArrayList<Card>();
}


class CardDeck{
	ArrayList<Card> cardDeck= new ArrayList<Card>();
}

class CardPlayer{
	ArrayList<Player> cardPlayer= new ArrayList<Player>();
}

class Dealer{
	public void ManageTheTurns() {
		//Manage the Turns
	}
}		