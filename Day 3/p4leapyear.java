import java.util.Scanner;
class LeapYear{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int year=0;
    System.out.println("Enter the year");
    year=s.nextInt();
    if(year%4==0){
      if(year%100==0){
        if (year%400==0){
          System.out.println(year+ " is a leap year");
        }
        else{
        System.out.println(year+ " is not a leap year");
        }
      }
      else{
        System.out.println(year+ " is a leap year");
      }
    }
    else{
      System.out.println(year+ " is not a leap year");
    }
  }
}