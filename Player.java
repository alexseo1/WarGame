import java.util.Collections;
import java.util.ArrayList; // or java.util*

public class Player {
	
		
	private ArrayList<Card> hand; // the player's cards
    private String name;
	// you may choose to use more instance variables
		
	public Player(){		
	    // create a computer player here
        hand = new ArrayList<Card>();
        name = "Computer";
	}
    public Player(String name){
        //create a human player here
        hand = new ArrayList<Card>();
        name = name; // whatever user's input is
    }

	public void addCard(Card c){
	    // add the card c to the end of the player's hand
        hand.add(c);
	}

	public void removeCard(Card c){
	    // remove the card c from the player's hand
        hand.remove(c);
    }
    
    public Card drawTop(){
        //draws the top card (at index 0) from the player's hand and removes it from hand
        Card top = hand.get(0);
        removeCard(top);
        return top;
    }
    
    public int cardCount(){
        //returns amount of cards in player's hand
        return hand.size();
    }
    
    public ArrayList<Card> wagerThree(){
        //wagers three top cards in arraylist and removes them from hand
        ArrayList<Card> threeTop = new ArrayList<Card>(); // don't need to put size
        for(int i=0; i<3; i++){
            threeTop.add(hand.get(0)); // once remove 0, the next one is 0
            hand.remove(0);
        }
        return threeTop;
    }
    
    public void shuffleHand(){
        //shuffle player's hand
        Collections.shuffle(hand);
    }

}
