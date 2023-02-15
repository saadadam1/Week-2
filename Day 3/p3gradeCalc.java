import java.util.Scanner;

class Grade {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int test1, test2, test3, total;
    System.out.println("enter test1 test2 and test3 scores");
    test1 = s.nextInt();
    test2 = s.nextInt();
    test3 = s.nextInt();
    if (test1 >= 50 && test2 >= 50 && test3 >= 50) {

      total = test1 + test2 + test3;
      total = total / 3;
      if (total > 90) {
        System.out.println("Grade A");
      } else if (total > 70) {
        System.out.println("Grade B");
      } else {
        System.out.println("Grade C");
      }
    } else {
      if (test1 < 50) {
        System.out.println("failed in test1 by " + (50-test1) + " marks");
      } else if (test2 < 50) {
        System.out.println("Failed in test2 by " + (50-test2) + " marks");
      } else {
        System.out.println("Failed in test3 by " + (50-test3) + " marks");
      }
    }
  }
}