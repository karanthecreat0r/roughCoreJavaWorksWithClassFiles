class outpost34
{
  public static void main(String[] args) {
    int a =20;
    int b = 40;
    boolean res =(a++ > b || b++ < a);
    System.out.println(a);
    System.out.println(b);
    System.out.println(res);
  }
}
