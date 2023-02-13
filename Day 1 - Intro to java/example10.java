//10. WAP to print number of notes for the given amount.

import java.util.Scanner;
class Ex10 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int amount,x1,x2,x3;
 
    System.out.println("Enter the amount");
    amount =s.nextInt();

    if(amount%100 !=0)
    {
   System.out.println("invalid amount");
    }
    if (amount>500)
    {
      x1=amount/500;
   amount=amount%500;
  System.out.println("Number of 500 notes is"+x1);
    }
    if (amount>200)
    {
      x1=amount/200;
   amount=amount%200;
  System.out.println("Number of 200 notes is"+x1);
    }
    if (amount>=100)
    {
      x1=amount/100;
   amount=amount%100;
  System.out.println("Number of 100 notes is"+x1);
    }
  
 
  }
}