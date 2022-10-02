class karan
{
  int a =5;
  double b=4;
  karan(){
    //L.i
    System.out.println("Hi from PWI");
  }
  public static void main(String[] args) {
    System.out.println("hi From Main");
    karan ref = new karan();
    System.out.println(ref);
    System.out.println("bye From Main");
  }
  //NSMLI
  {
    System.out.println("Hi non static multi line initializer");
  }
  public void test(){
    System.out.println("hi no args non static initializer");
  }

}
