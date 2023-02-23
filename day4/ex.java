import java.util.Scanner;


class Choice{
    Scanner s = new Scanner(System.in);
    public void isPerfect() {
        System.out.println("Enter number to check it is perfect or not");
        int num = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
            sum = sum + i;
            }
        }
    if (sum == num) {
      System.out.println("perfect number");
    } else {
      System.out.println("not a perfect number");
    }
    
  }
 
  public void isPrime() {
    System.out.println("Enter number to check it is prime or not");
    int num = s.nextInt();
    int fc = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        fc++;
      }
    }
    if (fc == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
  }
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Choice obj = new Choice();
      while(true){
           System.out.println("1. To check prime numebr");
            System.out.println("2. To check perfect numebr");
            System.out.println("4. To Exit");
            System.out.println("Choose your option: ");
        int option=s.nextInt();
        if(option==3){
            continue;
        }
        else if(option==1){
            obj.isPrime();
        }
        else if(option==2){
            obj.isPerfect();
        }
        else if(option==4){
            break;
        }else if(option<=0 && option>4){
             System.out.println("Invalid Choice");
             break;
        }
        System.out.println("*** Do you want to continue ? ***");
    }
     System.out.println("Have a good day");
  }
}