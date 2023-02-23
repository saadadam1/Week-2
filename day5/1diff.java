//Given an integer number n, return the difference between the product of its digits and the sum of its digits
import java.util.Scanner;

class Difference {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int sum = 0, prod = 1, rightMost,num;

    System.out.println("enter the number : ");
    num = s.nextInt();

        while (num != 0) {

           rightMost = num%10;
            sum += rightMost;
            prod *= rightMost;

            num /= 10;
        }
    System.out.println("The sum of the digits is = "+sum);
    System.out.println("The prod of the digits is = "+ prod);
    System.out.println("difference between the product of its digits and the sum of its digits " + (prod - sum));

    }
}