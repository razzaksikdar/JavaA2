package part2;


//A simple text adventure
//Assessment 1
//Razzak Sikdar



import java.math.*;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) {

    /*The player is in the middle of an infinite grey swamp. 
	This grey swamp has few distinguishing characteristics, 
	other than the fact that it is large and infinite and dreary.
	However, the player DOES have a magic compass that tells the player how far away the next feature of interest is.
	The player can go north,south,east,or west.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		// treasure location plotting a X, Y Coordinate. 
		double goalX = 10;
		double goalY = -10;
     
		//player location
		double playerX = 0;
		double playerY = 0;

		System.out.println("Welcome to the game");
		
        Distance ds=new Distance();
        double d=ds.DistanceCalculator(goalX, goalY, playerX, playerY);
        System.out.print( "Next feature of interest at the starting of the game(distance)>>");
	    System.out.println( "Compass Reads: " + d +"m");
       
		
		
		while (playerX != goalX || playerY != goalY) 
		{
			//calculating the distance using Pythagorean theorem
	
		    double distance =ds.DistanceCalculator(goalX, goalY, playerX, playerY);
		  
		    System.out.println("The Compass reads'"+distance+"m'");
		    
		    // user input for next move
			System.out.println("enter the next direction");
			System.out.println("For North/South/West/Est try n/s/w/e:");
		    String dir = sc.next();
		
		    if (dir.equals("n"))
		    	playerY++;
		    if (dir.equals("s"))
		    	playerY--;
		    if (dir.equals("e"))
		    	playerX--;
		    if (dir.equals("w"))
		    	playerX++;
		 
		    }
		 if (d==0) 
		     System.out.println("     ");
		     System.out.println("You have found it! you are the winner!");
		    
		    
		}
		
		  
	}



