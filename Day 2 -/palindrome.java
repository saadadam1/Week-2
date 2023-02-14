import java.util.Scanner;

class Pal {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter number to check palindrome");
    int num = s.nextInt();
    int rev = 0, temp;

    temp = num;
    while (num != 0) {
      rev = rev * 10 + (num % 10);
      num = num / 10;

    }
    if (rev == temp) {
      System.out.println("it is palindrome");

    } else {
      System.out.println("it is not palindrome");

    }
    // System.out.println("Reverse number: "+rev);

  }
}