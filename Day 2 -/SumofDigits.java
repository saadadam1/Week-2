// WAP to print sum of digits of a given number
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to find sum of digits");
    int num=s.nextInt();  // 52312
     int sum=0;
 
    while(num!=0){
      sum=sum+num%10;    // 0+2=> 2+1=> 3+3
      num=num/10;   //5231
    }
    System.out.println("sum of digits"+sum);
  
  }
}