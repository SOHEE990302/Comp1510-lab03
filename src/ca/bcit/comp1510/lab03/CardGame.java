/**
 * 
 */
package ca.bcit.comp1510.lab03;
import java.util.Random;
/**
 * A card game.
 * @author SoheeHwang
 * @version 2023
 *
 */
public class CardGame {

    /** 
     * Rank enumeration.
     */
    enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX, 
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    /** 
    *Suit Enumeration.
    */
    enum Suit { 
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES 
    }
    
    /**
     * Drives the program.
     * @param args unused.
     */
        
    public static void main(String[] args) {
        Random generator = new Random();
        int randomRankChoice = generator.nextInt(Rank.values().length);
        int randomSuitChoice = generator.nextInt(Suit.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        System.out.println("The card is " 
                + randomSuit + " " + randomRank + ".");
    }

}