class Example1 {
  public static void main(String args[]) {
 
    Scanner s = new Scanner(System.in);
    int count = 0;
 
    for (int k = 1; k <= 100; k++) { // k=1,2,3,4,5,6,7...100
      count = 0;
      for (int i = 1; i <= k / 2; i++) {
        if (k % i == 0) { // 50/25
          count++;
        }
      }
 
      if (count == 1) {
        System.out.print(k + " ");
      }
    }
 
  }
}

or

class Prime
{
   public static void main (String args[])
   {		
       int i =0,num=0;   
       
      System.out.println("The prime numbers from 1-100 are :");
       for (i = 1; i <= 100; i++)         
       { 		  	  
          int flag=0; 	  
          for(num =i; num>=1; num--)
	        {
             if(i%num==0)
	     {
 		flag = flag + 1;
	     }
	        }
	  if (flag == 2)
	  {
	     System.out.print(i + " ");
	  }	
       }	
      
       
   }
}