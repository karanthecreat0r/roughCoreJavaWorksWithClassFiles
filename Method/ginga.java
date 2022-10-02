//access static member instide static context
class dinga
{
  static int a = 14;//Staric Member
  static {//static context
    System.out.println(a);
    System.out.println(dinga.a);
  }
  public static void main(String[] args) {
    System.out.println("Hello world");
  }
  public static void m1()
  {
    //static context
  }
}
