// WAP to print number of digits of a given number using while loop.
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to find number of digits");
    int num=s.nextInt();  // 78723
     int digits=0;
    while(num!=0){
       num=num/10;    // 78723/10 ==> 0
        digits++;     //5
    }
    System.out.println("Number of digits: "+digits);
    
    
  }
}