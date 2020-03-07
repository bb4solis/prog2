/*Brenda Solis
  Class CEC 274-05
  Project: prog 2- Solitaire Prime
  Due Date: March 3, 2020
*/
import java.util.Scanner;

/***
 * Generates, displays, and runs a game of solitare using prime numbers
 * @author Brenda Solis and Steven Gold
 */
public class solitarePrime{
    /***
     *Displays options: New Card, Shuffle, Display,Play and Simulate 1000 times
     * and collects user input
     * @return choice
     */
    public static int  menu()
    {   Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("------Welcome to Solitare Prime------");
        System.out.print(" 1)New Deck\n 2)Display Deck\n 3)Shuffle Deck\n");
        System.out.print(" 4)Play Solitare Prime\n 5)Exit\n 6)Simulate 1000 times \n");
        choice=in.nextInt();

        return choice;
    }

    /***
     *
     * @param x, an integer that is tested
     * @return whether or not something is prime or not
     */
    public static boolean isPrime(int x)
    {
        if ( x <= 1 )return false;
        if(x==2) return true;
        for (int i =2; i < x; i++)
        {
            if ( x % i == 0) return false;
        }
         return true;
    }

    /***
     *This simulates a game of solitare using the value prime
     * originally set at false once the game is played it then returns true
     *
     * @param myDeck
     * @return true
     */
    public static boolean playSolitarePrime(Deck myDeck)
    {
        int sum=0;// Value of the current pile
        int piles=0;//Piles counts the number of piles made
        Card temp;//Current card that has been dealt

        boolean result= false;
        while(myDeck.cardsLeft()!=0)
        {
            //start a new pile has a value of 0
            sum =0;

            while (myDeck.cardsLeft() !=0 && isPrime(sum)==false)
            {
                temp=myDeck.deal();
                sum += temp.getValue();

                temp.display();
                System.out.print(", ");
            }
            System.out.println("Prime: "+ sum);
            piles++;

        }

        if (isPrime(sum))
        {
            System.out.println("Winner in " + piles + " piles");
            return result=true;
        }
        else
        {
            System.out.println("HA! Loser!");
            return result;
        }


    }
    public static void main(String[] Args) {
        int choice = 0;
        Deck oriDeck= new Deck();
        //oriDeck.display();
        choice=menu();

    //takes users input and allocates it to the right choice
        Deck myDeck = new Deck();
        while(choice!=5) {
            switch (choice) {
                case 1:
                    //creates the deck
                    myDeck = new Deck();

                    break;
                //prints the deck
                case 2:

                    myDeck.display();
                    break;
                    //shuffles the deck
                case 3:
                    myDeck.shuffle();
                    myDeck.display();
                    break;
                //plays the game of solitare prime
                case 4:
                    playSolitarePrime(myDeck);
                    break;
                //ends the game and thanks the user
                case 5:
                    System.out.println("Thank you for playing!<3");
                    break;
                //simulates the game 1000 times
                case 6:
                    int wins = 0, losses = 0;
                    for (int i = 0; i < 1000; i++) {
                        myDeck = new Deck();
                        myDeck.shuffle();
                        if (playSolitarePrime(myDeck) == true) wins++;

                        else losses++;

                    }
                    System.out.println("In 1000 games, you won:" + wins + " and lost:" + losses);
                    break;
                default:
                    System.out.print("INVALID INPUT GRRR.");
            }
           choice= menu();
        }

    }
}