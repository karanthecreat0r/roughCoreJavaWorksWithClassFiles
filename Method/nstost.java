class dinga
{
  int a=14;
  public void m2(){
    System.out.println("Hi From m1");
  }
  public static void main(String[] args) {
    dinga ref = new dinga();
    System.out.println(ref.a);
    ref.m2();
  }
}
