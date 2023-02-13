//8. WAP to accept age and print she/he is eligible for voting ot not.

import java.util.Scanner;
class Ex8 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int age;
 
    System.out.println("Enter the number");
    age =s.nextInt();

    if(age>=18)
    {
   System.out.println("Eligible to vote");
    }
     else
    {
  System.out.println("Not eligible to vote");
    }
  
 
  }
}