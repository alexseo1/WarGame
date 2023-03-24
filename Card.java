public class Card implements Comparable<Card>{
	
	private int suit; // use integers 1-4 to encode the suit
	private int rank; // use integers 1-13 to encode the rank
    private String[] suitsArr = {"Clubs", "Diamonds", "Spades", "Hearts"}; // an array with all suit names
    private String[] rankArr = {"Ace", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "Jack", 
                                "Queen", "King"}; // an array for rank names
	
	public Card(int s, int r){
		//make a card with suit s and value v
        suit = s;
        rank = r;
	}
	
	public int compareTo(Card c){
		// use this method to compare cards
        // we ONLY care about rank in game War
        // THREE outcomes: 1 if rank of this.card is greater than rank of 
        // the other card; need else if to not check every single condition
        int result = 0;
        if(this.rank > c.rank){
            result = 1;
        }
        else if(this.rank < c.rank){
            result = -1;
        }
        else if(this.rank == c.rank){
            result = 0;
        }
        return result;
	}
	
	public String toString(){
		// use this method to easily print a Card
        // How can we get the string name of the suit?
        // switch case; make two other instance variables and make them arrays:
        // string names of suits: <"diamond", "..."> AND one with all the ranks
        return rankArr[rank-1] + " of " + suitsArr[suit-1];
	}
	// add some more methods here if needed

}
