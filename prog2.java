/*Brenda Solis
  Class CEC 274-05
  Project: prog 2- Solitaire Prime
  Due Date: March 3, 2020
*/

/**
*/
import java.util.Random;
public class Deck{
    private Card[] storage;//make an arry of careds
    private int top;

    public Deck()
    {
        char[] suits={'H','D','S','C'};
        char[] ranks= {'A','2','3','4','5','6','7','8','9','T''J','Q','K'};
        storage= new Card[52];
        top=0;

        int count=0;
        Card C1;
        for(int s=0;r<ranks.length;r++)
        {
            C1= new Card(rank[r], suits[s]);
            storage [count++]=C1;
        }
        
    }

    public void display()
    {

    }
    
    public void shuffle()
    {
        private Card[] storage;
        private int top;
        public void shuffle()
        {
            card temp;
            for (int i =0;i <10000; i ++)
            {
                x=rand.nextInt(52);
                //y
                temp=storage[x];
            }
        }
    }
}

/*public class Card{
    private char suit;
    private char rank;

    public Card(char r,char s)
    {
        char suit=s;
        char rank=r;
    }
    public void display()
    {

    }
    public char getRank
    {

    }
    public char getSuite()
    {
        
    }
}
public static void main(String args[])
{

}
 
public static void menu(int choice)
{
    switch(choice)
    {
        case 1:
        //new deck
            break;
        case 2:
        //Display Deck
            break;
        case 3:
        //Shuffle Deck
            break;
        case 4:
        //Play Solitaire Prime
            break;
        case 5:
        //Exit
            return 0;
        break;
        default:
            System.out.print("Oh no you've imput an invalid character.Please Try again");
        break;
    }
}*/