class w2
{
  public static void main(String[] args) throws Exception {
    int a=1,b=10;
    System.out.println("************Welcome**************");
    System.out.println("Begins");
    while (a<=b) {
      Thread.sleep(500);
      System.out.println(a);
      a++;
      a+=4;
    }
    System.out.println("The End....Thank You");
  }
}
