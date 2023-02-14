import java.util.Scanner;
class Example14{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int intr,extr,proj,projscore,intscore,extscore,total;
    System.out.println("enter internal,external and project score");
    intr=s.nextInt();
    extr=s.nextInt();
    proj=s.nextInt();
    if(intr>=50 && extr>=50 && proj>=50){
      projscore=(proj*70)/100;
      extscore=(extr*20)/100;
      intscore=(intr*10)/100;
      total=projscore + extscore + intscore;
      if(total>90){
        System.out.println("Grade A");
      }
      else if(total>70){
        System.out.println("Grade B");
      }
      else {
        System.out.println("Grade C");
      }
    }
    else{
      if(proj<50){
        System.out.println("failed in projects with marks" +proj);
      }
      else if(extr<50){
        System.out.println("Failed in external with marks" +extr);
      }
      else{
        System.out.println("Failed in internal with marks " +intr);
      }
    }
  }
}