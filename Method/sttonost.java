class dingi
{
  static int a =14;
  static dingi ref;
  public static void main(String[] args) {
    ref = new dingi ();
    ref.m2();
  }
  public void m2(){
    System.out.println(a);
    System.out.println(dingi.a);
    System.out.println(ref.a);
  }
}
