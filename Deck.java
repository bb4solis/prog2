import java.util.Random;
/***
 * Generates, displays, and simulates a deck of card
 * @author Steven Gold and Brenda Solis
 */
public class Deck{
    private Card storage[];
    private int top;

    public Deck()
    {
        char [] suits={'H','D','S','C'};
        char [] ranks={'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
        storage = new Card [52];
        top =0;// the top card in the deck

        int count=0;
        Card C1;
        for( int s = 0 ; s < suits.length; s++)
        {
            for ( int r = 0; r < ranks.length; r++)
            {
                C1= new Card (ranks[r], suits[s]);
                storage [count++]=C1;
            }

        }
    }

    /***
     * displays deck of card in a 13 x 4 table
     */
    public void display()
    {
        for(int r=0;r<4;r++)
        {
            for(int c=0 ;c<13;c++)
            {
               storage[13 * r + c ].display();
               System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    /***
     * shuffles the order of deck of cards
     */
    public void shuffle()
    {

        Random rand = new Random();
        Card temp;
        int x,y,holder;
        for (int i = 0 ; i < 1000 ; i ++)
        {
            x=rand.nextInt(52);
            y=rand.nextInt(52);
            temp=storage[x];
            storage[x]=storage[y];
            storage[y]=temp;

        }
    }

    /***
     *
     * @return card at top of the deck
     */
    public Card deal()
    {
        return storage[top++];
    }

    /***
     *
     * @return number of cards left in a deck of 52 cards
     */
    public int cardsLeft()
    {
        return  52 - top;
    }
}