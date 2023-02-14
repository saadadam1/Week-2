// WAP to print number of even digits and odd digits of a given number using while loop.
import java.util.Scanner;
class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to find number of even and odd digits");
    int num=s.nextInt();  // 78723  --> 3 -odd  2-even
     int edigits=0,odigits=0;
    
    while(num!=0){          // 78723
       if((num%10)%2==0){   // 7
         edigits++;     //2
       }
      else{
        odigits++;     //3
      }
      
      num=num/10;    // 78723/10 ==> 0
        
    }
    System.out.println("Number of even digits: "+edigits);
    System.out.println("Number of odd digits: "+odigits);
    
    
    
  }
}