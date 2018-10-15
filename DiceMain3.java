/**
 * 
 * @author Tanya Kalianda
 * Dice Project
 */
import java.util.Scanner;

public class DiceMain3 
{

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value between 2 and 12: ");
		if (scan.hasNextInt())
		{
			int value = scan.nextInt();
			scan.nextLine();
			
			while (value<2 || value>12) //cannot write (value<2 || >12) -> error
			{
				System.out.println("Error: The value must be between 2 and 12");
				scan.nextInt();		// OR in = new Scanner(System.in);
				System.out.print("Enter another value: ");
				value = scan.nextInt();
			}
			
			int actualValue = value;
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			int sum = roll1 + roll2;
			
			while (sum!=actualValue)
			{
				System.out.println("Dice1: " + roll1);
				System.out.println("Dice2: " + roll2);
				System.out.println("Sum of rolls: " + sum);
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2; 
			}

			double numRolls = dice2.getNumRolls() + dice1.getNumRolls();
			System.out.println("Total number of rolls " + numRolls);
			System.out.println("Dice1: " + roll1);
			System.out.println("Dice2: " + roll2);
			System.out.println("Sum of dice: " + sum);
		}
	}
}

