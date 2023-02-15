/*1. Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/

import java.util.Scanner;
class Game
{
	public static void main(String arg[])
	
	{
    int computerChoice=0,userChoice=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the users choice :");
      System.out.println("1. Rock");
	    System.out.println("2. paper");
	    System.out.println("3. scissor ");

      userChoice=sc.nextInt();

    if(userChoice>=4 && userChoice==0)
    {
      System.out.println("invalid choice");
    }
    else if(userChoice==1)
    {
      System.out.println("User chooses Rock");
    }
    else if(userChoice==2)
    {
      System.out.println("user chooses paper");

    }
    else
    {
      System.out.println("user chooses scissor");

    }
    System.out.println();
System.out.println("enter the computer choice :");
      System.out.println("1. Rock");
	    System.out.println("2. paper");
	    System.out.println("3. scissor ");

      computerChoice=sc.nextInt();

if(computerChoice>=4 && computerChoice==0)
    {
      System.out.println("invalid choice");
    }
    else if(computerChoice==1)
    {
      System.out.println("computer chooses Rock");
    }
    else if(computerChoice==2)
    {
      System.out.println("computer chooses paper");

    }
    else
    {
      System.out.println("computer chooses scissor");

    }
System.out.println();
    
	 if(computerChoice==userChoice)
   {
     System.out.println("Game is tie");

   }
    else if(userChoice==1 && computerChoice==2)
    {
      System.out.println("Compter wins");

    }
    else if(userChoice==2 && computerChoice==1)
    {
      System.out.println("User wins");
    }
    else if(userChoice==2 && computerChoice==3)
    {
      System.out.println("Compter wins");

    }
    else if(userChoice==3 && computerChoice==2)
    {
      System.out.println("User wins");

    }
    else if(userChoice==3 && computerChoice==1)
    {
      System.out.println("Compter wins");

    }
    else
    {
      System.out.println("User wins");

    }



    
	}
 
}