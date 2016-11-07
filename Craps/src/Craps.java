import java.util.Scanner;

public class Craps
	{

		public static void main(String[] args)
			{
				boolean stillRoll = true;
				Scanner userInput = new Scanner (System.in);
				System.out.println("Welcome to craps, what's your name?");
				String name = userInput.nextLine();
				int balance = 1000;
				System.out.println("Nice to meet you, " + name + "! Your balance is $" + balance + ".");
				System.out.println("We're gonna play craps, how much would you like to bet?");
				Scanner userInput2 = new Scanner (System.in);
				int wager = userInput2.nextInt();
				int dieOne = (int)(Math.random()*6)+1;
				int dieTwo = (int)(Math.random()*6)+1;
				int diceSum = (dieOne + dieTwo);
				int point = diceSum;
			
				
				if (diceSum == 7 || diceSum == 11) 
					{
						balance = balance + wager;
						System.out.println("Congratulations! You rolled a, " + dieOne + " and a " + dieTwo + " for a total of " + diceSum + " You win, " + name + " and your new balance is $" + balance + ".");
						stillRoll = false;
					}
				else if (diceSum == 2 || diceSum == 12)
					{
						balance = balance - wager;
						stillRoll = false;
					System.out.println("That's too bad. You rolled a, " + dieOne + " and a " + dieTwo + " for a total of " + diceSum + " You lose, " + name + " and your new balance is $" + balance + ".");											}
				else 
					{
					System.out.println("You rolled a, " + dieOne + " and a " + dieTwo + ". Your point is " + diceSum + ", " + name + ".");
					System.out.println("Let's roll again");
					}
				
				while (stillRoll)
				{
					int dieOne1 = (int)(Math.random()*6)+1;
					int dieTwo2 = (int)(Math.random()*6)+1;
					int diceSum3 = (dieOne1 + dieTwo2);
					if (point == diceSum3)
						{
							balance = balance + wager;
							System.out.println("Your point is " + point + " and you rolled a " + diceSum3 + " You win, " + name + " and your new balance is $" + balance + "." );
							stillRoll = false;
						}
					else if (point == 7)
						{
							balance = balance - wager;
							System.out.println("Your point is " + point + " and you rolled a " + diceSum3 + " you lose, " + name + " and your new balance is $" + balance + "");
							stillRoll = false;
						}
					else 
						{
							System.out.println("Your point is " + point + " and you rolled a " + diceSum3 + ". Let's keep rolling!");
						}
			    }
					System.exit(0);
	}
	}
