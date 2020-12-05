import java.util.Random;
import java.util.Scanner;

public class snake_and_ladder {
	
	public static int rollDice()
	{
	int n=0;
	Random r = new Random();
	n=r.nextInt(7);
	return (n==0?1:n);
	}
	
	int player1= 0;
	int currentplayer=-1;
	int pos=0;
	static Scanner s =  new Scanner(System.in);
	static String Str;
	
	static int dicevalue = 0;
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int initialplayer;
			System.out.println(initialplayer=0);

			
				System.out.println("Press r to roll the dice");
				Str = s.next();
				dicevalue = rollDice();
			
	}

}
