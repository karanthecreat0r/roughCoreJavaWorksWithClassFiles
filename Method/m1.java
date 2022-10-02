class m1
{
  m1()
  {
    System.out.println("hello from contrructoor");
    //L.I
  }
  static int a=5;
  static void karan(int b){

    System.out.println("hi iam karan");
    System.out.println(b);

  }
  public static void main(String[] args) {
    m1 obj =new m1();
    m1 obj2 = new m1();
    System.out.println("hi iam main");

    karan(3);
  }
  static{
    System.out.println(a);
  }

  static {
    System.out.println("efr");

  }
  {
    System.out.println("hi iam non static");
  }
  {
    System.out.println("hello iam non static block 2");
  }

}
