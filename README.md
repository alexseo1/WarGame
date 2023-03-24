# WarGame
Card.java: This class represents a card with a suit and rank. You will need to implement Comparable and write a compareTo() method.
The cards should be ordered by their rank, and their suit should only be considered if the rank of two cards is the same.
The suit order is clubs (1), diamonds (2), hearts (3), and spades (4).

Deck.java: Represents a deck of 52 cards. This class holds an array of Card objects and should be able to shuffle and deal the top card.

Player.java: The Player class should include a constructor for a computer player and a constructor for a human player.
Human players should be able to input their name through the constructor, while a computer player’s name should be "computer".
A player should have an ArrayList of Cards that stores all of their current cards.
You will need to implement the methods addCard(), removeCard(), shuffleHand(), cardCount() and wagerThree().
Their descriptions are provided in the Player class.

Game.java This is where the players and the deck are instantiated, and the game is played.
Instructions for completing the Game class are written in its definition.
