class k1
{
  public k1(){
    //L.I
    System.out.println("hi from no args");
  }
  k1 (double b){
    //L.I
    System.out.println("hi from args"+b);
  }
  public static void main(String[] args) {
    k1 obj1 = new k1(5);
    k1 obj2 = new k1(6);
    System.out.println("Bye");
  }
}
