import java.util.Scanner;
class Simple
{
	public static void main(String arg[])
	
	{
    double Pamount=0,rate=0,choice=0;
    double si=0.0,total;
	    Scanner s=new Scanner(System.in);
	  
    System.out.println("Enter the principle amount");
    Pamount=s.nextInt();
    
    System.out.println("Enter the Annual rate");
    rate=s.nextInt();

    System.out.println("Enter the Time period");
    System.out.println("1. Day");
    System.out.println("2. Month");
    System.out.println("3. Year");
    choice=s.nextInt();

    
    
    if(choice==1)
    {
    
      
    
      si= ((Pamount*rate)/100)/365;
      
    System.out.println("The simple interest is" + si);
    System.out.println("The Principal Amount is" + Pamount);
    System.out.println("The Total value is" + (si+Pamount));
    }
    else if(choice==2)
    {
      si= ((Pamount*rate)/100)/12;
      
    System.out.println("The simple interest is" + si);
    System.out.println("The Principal Amount is" + Pamount);
    System.out.println("The Total value is" + (si+Pamount));
    
    }
      else
    {
      si= (Pamount*rate)/100;
      
    System.out.println("The simple interest is" + si);
    System.out.println("The Principal Amount is" + Pamount);
    System.out.println("The Total value is" + (si+Pamount));
    
    }

   


    

   
	}
 
}







/*import java.util.Scanner;
class Simple
{
	public static void main(String arg[])
	
	{
    int Pamount=0;
    double rate=0.1,time=0.00274,si=0.0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the principle amount");
    Pamount=s.nextInt();

    si= Pamount* (1+(rate*time)) - Pamount;
    System.out.println("Interest Earned = "+si);
    System.out.println("Principal Amount = "+Pamount);
    System.out.println("Total Value = "+(si+Pamount));


    

   
	}
 
}*/