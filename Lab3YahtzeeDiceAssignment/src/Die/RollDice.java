package Die;

public class RollDice {
	

	private int numDice;
	private int numSides;
	private Die[] RollArray;
	

	public RollDice() {
		// TODO Auto-generated constructor stub
		//Initialize all the variable
		numDice=0;
		numSides=0;
		RollArray=null;
	
	}
	
	public RollDice(int numDice,int numSides)
	{
		this.numDice=numDice;
		this.numSides=numSides;
		this.RollArray=new Die[numDice]; //array to hold all the dice
		
		int i;
		for (i=0;i<numDice;i++)
		{
			RollArray[i]=new Die(numSides);
		}
	}
	
	public int roll() {
		//Roll the Die 
		int i,sum=0;
		for(i=0;i<numDice;i++)
		{
			sum=sum+rollDie(i);
		}
		//Return Sum of all dice
		return sum;
	}
	//Roll the value of  dice in Array
		public int rollDie(int numDice)
		{
			return RollArray[numDice].roll();
		}
		


}
