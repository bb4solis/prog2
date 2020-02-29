/*Brenda Solis
  Class CEC 274-05
  Project: prog 2- Solitaire Prime
  Due Date: March 3, 2020
*/

import java.util.Scanner;
import java.util.Random;
//We will build the card first 

public class Card{
    private char suit;
    private char rank;
    public Card(char r, char s)
    {
        char rank=r;
        char suit=s;
    }
    public void display()
    {
        System.out.print(rank + suit);
    }
    public int getValue()
    {
        int val;
        if ( Character.isLetter(rank)&& rank !='A')
          {
            val=10;
          }
        else if (rank=='A')val=1;
        else val=rank;

        return val;
    }
    public char getRank()
    {
        return rank;
    }
    public char getSuit()
    {
        return suit;
    }
}

public class Deck{
    private Card [] storage;
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
            C1= new Card (rank [r], suits[s]);
            storage [count++]=C1;
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

public static int  menu()
{   Scanner in= new Scanner(System.in);
    int choice;
    System.out.println("------Welcome to Solitare Prime------");
    System.out.print("1)New Deck\n 2)Display Deck\n 3)Shuffle Deck\n");
    System.out.print("4)Play Solitare Prime\n 5)Exit\n 6)Simulate 1000 times \n");
    choice=in.nextInt();
    return choice; 
}
public static boolean isPrime(int x)
{   boolean answer=false;
    if(isPrime(x)==true) answer=true;
    return answer;
}
public static void main(String[] Args)
{   int choice=menu();
    do
    {
    }while(choice!=6);
}
/**
 * switch(choice)
    {
        case 1:
            Deck myDeck= new Deck();
            break;
        case 2:
                
        break;
        case 3:

            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            int wins=0m losses=0;
            for(int i=0; i < 1000; i++)
            {
                myDeck = new Deck();
                myDeck.shuffle();
                if(playSolitarePrime(myDeck)==true) wins++;
                else losses++;
            }
            System.out.println("In 1000 games, you won:"+wins+" and lost:"+ losses);
            break;
        default:
            System.out.print("INVALID INPUT GRRR.");
 */