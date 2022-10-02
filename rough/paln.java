class prim
{
  public static void main(String[] args) {
    int num;
    int flag=0;
    int n=8;
    if (n==0||n==1) {
      System.out.println("not a prime");
    }
    else if (n==2) {
      System.out.println("It is natural prime");
    }
    else {
      for (num=2;num<n ;num++ ) {
        if (n%num==0) {
          System.out.println("Not a prime");
          flag =1;
          break;
        }
      }
      }
  if (flag==0) {
    System.out.println("it is true");
  }
}
}
