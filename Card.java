public class Card{
    private char suit;
    private char rank;
    public Card(char r, char s)
    {
         rank=r;
         suit=s;
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