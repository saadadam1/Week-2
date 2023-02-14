import java.util.Scanner;
class Factor100 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    int sum=0;

    for(int k=1;k<=100;k++)
      {
        sum = 0;
     for(int i=1;i<=k/2;i++){
       if(k%i==0){
         sum=sum+i;
       }
     }
    if(sum==k){
      sum++;
      System.out.println(k);
    }
    
    }
      }
    
       
    
  }
