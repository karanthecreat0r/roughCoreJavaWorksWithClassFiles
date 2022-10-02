class fiborec
{
static int n1=0,n2=1,n3;
  public static  void fiboos(int num){
  if (num>0) {
    n3=n1+n2;
    n1=n2;
    n2=n3;
    System.out.print(" "+n3);
    fiboos(num-1);
  }
}
  public static void main(String[] args) {
    int num = 10;
    System.out.print(n1+" "+n2);
    fiboos(num-2);
  }

}
