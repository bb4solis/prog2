/*Brenda Solis
  Class CEC 274-05
  Project: prog 2- Solitaire Prime
  Due Date: March 3, 2020
*/
import java.util.Scanner;
public class prog2{
public static void main(String[] Args){
    int choice=0;
    menu();
    
    do
    {

    }while(choice!=6);
}

public static int  menu()
{   Scanner in= new Scanner(System.in);
    int choice;
    System.out.println("------Welcome to Solitare Prime------");
    System.out.print("1)New Deck\n 2)Display Deck\n 3)Shuffle Deck\n");
    System.out.print("4)Play Solitare Prime\n 5)Exit\n 6)Simulate 1000 times \n");
    choice=in.nextInt();
    in.close();
    return choice; 
}
public static boolean isPrime(int x)
{   
     
        // Corner case 
        if (x <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < x; i++) 
            if (x % i == 0) 
                return false; 
  
        return true; 
    
}
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