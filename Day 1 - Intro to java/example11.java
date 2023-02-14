import java.util.Scanner;
class Example11{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a,x,y,z,b,c;
    System.out.println("enter the amount");
    a=s.nextInt();
    if(a%100==0){
      x=a/500;
      b=a%500;
      y=b/200;
      c=b%200;
      z=c/100;
      System.out.println(x+" 500 notes");
      System.out.println(y+" 200 notes");
      System.out.println(z+" 100 notes");  
    }
    else{
      System.out.println("Invalid amount");
    }
  }
}