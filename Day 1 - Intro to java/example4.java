import java.util.Scanner;
class Ex6 {
  public static void main(String args[]) {
 
  Scanner s=new Scanner(System.in);
    
    int salary=0, bill1 =0, bill2 =0, bill3=0;
    int total = 0, percent = 0;
 
    System.out.println("Enter the salary");
    salary=s.nextInt();
    System.out.println("Enter the 3 bills");
    bill1=s.nextInt();
    bill2=s.nextInt();
    bill3=s.nextInt();
    
    total = bill1 + bill2 + bill3;
    percent = (total*100) / salary;
 
    System.out.println("total shopping amount is : " + total);
    System.out.println("percentage he/she spent on shopping is : " + percent +"%" );   
 
  }
}