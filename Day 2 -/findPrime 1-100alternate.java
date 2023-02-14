class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    int count = 0,primecount=0;
 
    for (int k = 1; k <= 100; k++) { // k=1,2,3,4,5,6,7...100
 
      for (int i = 1; i <= k / 2; i++) { // 1<=1 count=2
        if (k % i == 0) { // 3%1
          count++;
        }
      }
 
      if (count == 1) {
           primecount++;
        if(primecount%2!=0){
        System.out.print(k + " "); // 2
        }
      }
      count = 0;
    }
 
  }
}

or

class Prime {
  public static void main(String args[]) {
    int i = 0, num = 0, skip = 0;

    System.out.println("The prime numbers from 1-100 are :");
    for (i = 1; i <= 100; i++) {
      int flag = 0;

      for (num = i; num >= 1; num--) {
        if (i % num == 0)

        {
          flag = flag + 1;
        }
      }

      if (flag == 2) {
        skip++;
        if (skip % 2 != 0) {

          System.out.print(i + " ");

        }
      }
    }
  }

}
