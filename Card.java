import java.util.Random;
/***
 * Generates, displays, and simulates a card
 * @author Brenda Solis
 */
public class Card{
    private char suit;
    private char rank;
    public Card(char r, char s)
    {
        rank=r;
        suit=s;
    }

    /***
     *
     * @return
     */
    public int getValue()
    {

        int val;
        if(Character.isLetter(rank))
        {
            if(rank=='A') val=1;
            else val=10;
        }
        else val=Character.getNumericValue(rank);
        return val;
    }

    /**
     * displays a card by rank and suit
     */
    public void display()
    {   if(getRank()=='T')System.out.print("10"+""+getSuit());
        else System.out.print( getRank() +""+ getSuit() );
    }

    /**
     *
     * @return the rank of said card
     */
    public char getRank()
    {
        return rank;
    }

    /***
     *
     * @return value of the suit for said card
     */
    public char getSuit()
    {
        return suit;
    }
}