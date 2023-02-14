// WAP to print reverse of a given number.
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to print reverse order");
    int num=s.nextInt();  // 1234    -- 1 10  100  1000 10000 100000
    int rev=0;
    
    while(num!=0){
        rev=rev*10+(num%10);   // 0+4=> 40+3=>430+2=> 4320+1=>4321
         num=num/10;  // 1
    }
   System.out.println("Reverse number: "+rev); 
    
  }
}