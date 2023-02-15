/*2. Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/

import java.util.Scanner;

class Age {
  public static void main(String arg[])

  {
    int day = 0, month = 0, year = 0, currentYear = 2023, age = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter your age : day month year");
    day = s.nextInt();
    month = s.nextInt();
    year = s.nextInt();

    if (day <= 0 && day > 31) {
      System.out.println("Invalid day");
    }
    if (month <= 0 && month > 12) {
      System.out.println("Invalid month");
    }
    if (year > currentYear) {
      System.out.println("Invalid year");
    }

    age = currentYear - year;

    System.out.println("Your age is :" + age);

    if (age >= 18) {
      System.out.println("Your are an adult");
    } else {
      System.out.println(" You are a minor");
    }
  }

}