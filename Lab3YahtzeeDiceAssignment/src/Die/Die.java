package Die;

import java.util.Random;
 //Class representing a die class
public class Die {

	private int numSide;  //number of die sides that die has
	private int numDice;  // number of dice
	private int sideUp; // upper side of the die
	private int value;
	String diceType; //type of the dice
	
	
	
	public Die() {
		// TODO Auto-generated constructor stub
		 diceType = "d6";
	      numSide=6;
	      sideUp = (int)(Math.random()*numSide + 1);   
		
	}
	
	public Die( int numSide)
	{      //1 argument constructor
		diceType= "d"+numSide;
		this.numSide = numSide;
		sideUp = (int)(Math.random()*numSide + 1);
	}
	
	
	
	
	public Die( String diceType , int numSide)
	{ //two argument constructor
		this.numSide= numSide;
		this.diceType= diceType;
		sideUp =(int)(Math.random()*numSide + 1);
		
		
	
	}
	
       public int getNumSides() {
    	   //Return Number of sides die has
    	   return numSide;
       }
       
       public int setNumSides() {
    	return numSide;
    	  
       }
       
   
       public int roll()
       { 
    	   // Return a number from 1 to side count
    	   sideUp=(int)(Math.random()*numSide + 1);
    	   return sideUp;
    	   
    	   
        
       }
       
      
       
       int getValue()
       {
    	   return value;
       }
       
       public int getSideUp() {
    	   //Return Upper side number of a die
   		return sideUp;
   	}

   	public void setSideUp(int sideUp) {
   		this.sideUp = sideUp;
   	} 
       @Override public String toString()
       { 
    	   return  "Rolling die with " + numSide+ " sides and Upside is" +sideUp  ;
    	   }
	
       
       public static void main(String[] args) {
   		// TODO Auto-generated method stub

   		
   		Die sixside = new Die(); // Call a Default Constructor
   		System.out.println(sixside);
   		//Roll Six  and print sided die
   		for(int i=0;i<6;i++)
   	{
   			System.out.println(sixside.roll()+"  ");	
   	}
   		
   		Die twentySided = new Die(20); //Call a one argument parameterized Constructor
   		System.out.println(twentySided);
   		//Roll and Print 20 sided die
   		for(int i=0;i<20;i++)
   		{
   		System.out.println(twentySided.roll()+"  ");	
   	}
   		
   		RollDice myDice=new RollDice(5, 6); //call two argument constructor from RollDice Class
   			System.out.println("Sum of 5 Six-Sided Dies = " + myDice.roll());	//Print Sum of 5 Six Sided dice

   		
   		
   			//Code to check how many rolls it takes to get Yahtzee
   			//Create 5  six sided dice
   			
   		 int Die1;  int Die2;  int Die3;  int Die4;  int Die5;
			
   		      //save random values in the variables
			 Die1=(int)(Math.random()*6) + 1;
			 Die2=(int)(Math.random()*6) + 1;
			Die3=(int)(Math.random()*6) + 1;
			Die4=(int)(Math.random()*6) + 1;
			Die5=(int)(Math.random()*6) + 1;
			
				int rolls=0;
				while(true)
					
				{
					rolls+=1;
					//Declare variable count and save die1 value in that variable to
					
					//check all die have same value or not
				int count= Die1=(int)(Math.random()*6) + 1;
					if(count==Die2)
					{
						continue;
					}
					else if( count==Die3) {
						continue;
					}
					else if(count==Die4)
					{
						continue;
					}
					else if(count == Die5)
					{
						continue;
					}
					break;
					  
				}
				rolls++;
				
				System.out.println("It takes" +rolls+"rolls to get Yahtzee");
   		
   	}
}








