import java.util.Random;

public class Deck{
    private Card storage;
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
    public void display()
    {   
        for(int r=0;r<4;r++)
        {
            for(int c=0 ;r<13;j++)
            {
                System.out.print( storage [13 * r + c ] + ", " );
            }
        }
    }
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
    public Card deal()
    {
        return storage[top++];
    }
    public int cardsLeft()
    {
        return  52 - top;
    }
}