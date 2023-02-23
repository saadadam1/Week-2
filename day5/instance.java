// to learn about instances and variables how it works

class Example11 {
  int i = 100;
 
  public void m1() {
    int i = 300;
    System.out.println(i);
  }
 
  public void m2() {
    int i = 200;
    System.out.println(i);
  }
 
  public static void main(String args[]) {
 
    Example11 obj = new Example11();
    obj.m1();
    obj.m2();
 
  }
}