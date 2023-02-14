import java.util.Scanner;
class Example12{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int basic,gross,hra,da;
    System.out.println("enter the basic salary");
    basic=s.nextInt();
    if(basic<10000){
      hra=(basic*67)/100;
      da=(basic*78)/100;
      gross=basic+hra+da;
      System.out.println("gross salry is" +gross);  
    }
    else if(basic>10000 && basic<20000){
      hra=(basic*70)/100;
      da=(basic*80)/100;
      gross=basic+hra+da;
      System.out.println("gross salry is " +gross);
    }
    else{
      hra=(basic*67)/100;
      da=(basic*78)/100;
      gross=basic+hra+da;
      System.out.println("gross salry is " +gross);
    }
  }
}