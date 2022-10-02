class Strong
{
  public static void main(String[] args) {
    int num=145;
    int temp=num;
    int res=1;
    int fin=0;
    while (num>0) {
      int n=num%10;
      for (int i=1;i<=n ;i++ ) {
        res=res*i;
      }
      fin=fin+res;
      res=1;
      num=num/10;
    }
    if (fin==temp) {
      System.out.println("It is Strong");
    }
    else {
      System.out.println("It is not");
    }
  }
}
