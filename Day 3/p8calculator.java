import java.util.Scanner;

class Calculator {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num1, num2, choice = 0;

    System.out.println("enter the first number");
    num1 = s.nextInt();

    System.out.println("enter the second number");
    num2 = s.nextInt();
    
    System.out.println("enter the operation you want to do");

    System.out.println("1. Addition");
    System.out.println("2. Substraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    choice = s.nextInt();

    

    if (choice == 1) {
      System.out.println("Addition of two numbers is :" + (num1 + num2));
    } else if (choice == 2) {
      System.out.println("Substraction of two numbers is :" + (num1 - num2));
    } else if (choice == 3) {
      System.out.println("Multiplication of two numbers is :" + (num1 * num2));
    } else if(choice==4)
      {
      if (num2 == 0) {
        System.out.println("Error");
      } else {
        System.out.println("Division of two numbers is :" + (num1 / num2));
      }
    } 
    else
    {
      System.out.println("Invalid operation choice");
    }
  }
}