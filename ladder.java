
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


	class SnakeandLadder{
	
		static Map <Integer , Integer> snake = new HashMap<Integer , Integer >();
		static Map <Integer , Integer> ladder = new HashMap<Integer , Integer >();
		{	 
		snake.put(1,1);
		
		ladder.put(1,25);
		}
			
		
	public int calculatePlayer (int player,int dicevalue) {
		if(null!=snake.get(player))
		{
			System.out.println("swallowed by snake");
			player=snake.get(player);
			
		}
		if(null!=ladder.get(player))
		{
			System.out.println("climb ladder");
			player=ladder.get(player);
		
		}
		return player;
		
		
		public void startGame() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
		public class snake_and_ladder {
			
			int player1= 0;
			int currentplayer=-1;
			int pos=0;
			static Scanner s =  new Scanner(System.in);
			static String Str;
			
			static int dicevalue = 0;
			
			public static int rollDice()
			{
			int n=0;
			Random r = new Random();
			n=r.nextInt(7);
			return (n==0?1:n);
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		 SnakeandLadder s = new SnakeandLadder();
		 s.startGame();
		 
		 
	}

}

