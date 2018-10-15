/**
 * 
 * @author Tanya Kalianda
 * Dice Doubles
 */
public class DiceDoublesMain
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice(); 
		Dice dice2 = new Dice();
		int roll1 = dice1.roll();   
		int roll2 = dice2.roll();    //int count = 1; (if using a counter)
		
		while (roll1!=roll2)
		{
			System.out.println("Dice1: " + roll1);
			System.out.println("Dice2: " + roll2);
			int sum = roll1 + roll2;
			System.out.println("Sum of rolls: " + sum);
			roll1 = dice1.roll();
			roll2 = dice2.roll();   	//count++ (if using a counter)
		}
		
		double numRolls = dice1.getNumRolls() + dice2.getNumRolls(); //could use a counter instead of numRolls
		System.out.println("Total number of rolls before doubles: " + numRolls);
		System.out.println("Dice1: " + roll1);
		System.out.println("Dice2: " + roll2);
		int sumDoubles = roll1 + roll2;
		System.out.println("Sum of Doubles: " + sumDoubles);
		
	}

}
