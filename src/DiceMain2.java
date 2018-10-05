
public class DiceMain2 
{

	public static void main(String[] args) 
	{
			Dice dice = new Dice(); //1st thing to do in test class: instantiate the dice class
				// data type = Dice (class)
				// variable = dice
				// new Dice() = constructor
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			System.out.println(dice.roll());
			
			System.out.println("rolls" + dice.getNumRolls());
			
			
			//System.out.println(Math.random()*6);;
			//((int)Math.random()*6) -> will cast math.random as an integer, but thats always 0-.999
			//the above is an error (will always get 0)
			System.out.println((int)(Math.random()*6)+1);
			//int casts the floating point value (5.99) to get 5 -> add 1 to include 6
			//int casts Math.number as an integer -> truncates it to 5 
			//need () around (Math.random()*6) to get it to multiply by 6 first
	}

}
