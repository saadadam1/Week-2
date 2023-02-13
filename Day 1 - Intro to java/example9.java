import java.util.Scanner;
class Ex9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = input.nextInt();			
		if(num==1)
			System.out.println("This is  Sunday");
		else if(num==2)
			System.out.println("This is  Monday");
		else if(num==3)
			System.out.println("This is  Tuesday");
		else if(num==4)
			System.out.println("This is  Wednesday");
		else if(num==5)
			System.out.println("This is Thursday");
		else if(num==6)
			System.out.println("This is Friday");
		else if(num==7)
			System.out.println("This is Saturday");
		else
			System.out.println("Error: please enter Enter from 1 to 7");
	}
}