class Odd
{
  public static void main(String[] args) {
    int n=1;
    while (n<=10) {
      int num = n%2;
      if (num==0) {
        System.out.println(n+ " even");
      }
      else {
        System.out.println(n+ " odd");
      }
      n++;

    }
  }
}
