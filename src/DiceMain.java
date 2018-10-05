
public class DiceMain 
{

	public static void main(String[] args) 
	{
		Dice dice = new Dice(); 
		int count = 0;
		int roll = dice.roll();   //must store info in variable to access data in future
		System.out.println(roll); //system.out.println(dice.roll();
								 //if(dice.roll(); -> wrong b/c it will print roll then check if the roll =3 
								// this will roll the die twice -> WRONG 
		
		if (roll==3)
		{
			count++; //adds 1 to count every time the roll = 3
					//can use if (roll==3) count ++ on the same line
		}
		
		roll = dice.roll();  //cannot write int roll again b/c will get an error -> can't redeclare that same variable (can just reassign it to a dif number)
		System.out.println(roll);
		if (roll==3)
		{
			count++;
		}
		
		roll = dice.roll();
		System.out.println(roll);
		if (roll==3)
		{
			count++;
		}
		
		roll = dice.roll();
		System.out.println(roll);
		if (roll==3)
		{
			count++;
		}
		
		roll = dice.roll();
		System.out.println(roll);
		if (roll==3)
		{
			count++;
		}
		
		roll = dice.roll();
		System.out.println(roll);
		if (roll==3)
		{
			count++;
		}
		
		System.out.println("you rolled three " + count + " times");
	}
		
	
	
	
	
	
	
	
	
}
