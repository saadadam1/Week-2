import java.util.Scanner;
class Employee{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    long sal;
    System.out.println("Enter the salary");
    sal=s.nextInt();
    if(sal<=300000){
      System.out.println("Tax is zero");
      System.out.println("net salary is :" +sal);
    }
    else if(sal<=600000){
      System.out.println("Tax is 5%");
      sal=sal-(sal*5)/100;
      System.out.println("Net salary is " +sal);
    }
    else if(sal<=900000){
      System.out.println("Tax is 10%");
      sal=sal-(sal*10)/100;
      System.out.println("Net salary is " +sal);
    }
    else if(sal<=1200000){
      System.out.println("Tax is 15%");
      sal=sal-(sal*15)/100;
      System.out.println("Net salary is " +sal);
    }
    else{
      System.out.println("Tax is 20%");
      sal=sal-(sal*20)/100;
      System.out.println("Net salary is " +sal);
    }
  }
}