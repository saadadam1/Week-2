import java.util.Scanner;
class Temperature{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    double temp=0,num;
    System.out.println("Enter the Temperature");
    temp=s.nextInt();
    System.out.println("If it is celcius click 1  and if it is fahrenhiet click 2");
      num=s.nextInt();
    if(num==1){
      temp=temp*1.8 + 32;
      System.out.println("Temperature in Farenheit is :" +temp);
    }
    else if(num==2){
      temp=(temp-32)*(9/5);
      System.out.println("Temperature in celcius is :" +temp);
    }
    else{
      System.out.println("Enter the correct choice");
    }
    
  }
}