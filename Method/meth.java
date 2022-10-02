class calc
{
  public static void main(String[] args) {
    System.out.println("\t calculator");
    System.out.println("the add two number is "+add(1,2));
    System.out.println("the add three number is "+add(1,2,3));

  }
  static public int add(int a, int b){
    return(a+b);

  }
  static public int add (int a, int b, int c){
    return (a+b+c);
  }
  static public int add (int a, int b,int c, int d){
    return(a+b+c+d);
  }
}
