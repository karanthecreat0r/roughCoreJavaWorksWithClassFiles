class m1
{
  static double k=80;
  static boolean b =true;
  public static void main(String[] args) {
    System.out.println("hi iam main");
    double res = add(1,2);
    System.out.println(res);
    System.out.println("Bye From Main");
  }
  public static int add(int a,int b){
    System.out.println("hi Iam add");
    System.out.println("Bye iam add");
    return (a+b);
  }
  static {
    int a =15;
    System.out.println(a);
  }
}
