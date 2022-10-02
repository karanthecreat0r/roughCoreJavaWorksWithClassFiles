import  java.util.Scanner;
class ss
{
  //create object
  static Scanner s=new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    System.out.println("Enter Your Age:");
    int Age=s.nextInt();//reading integer
    System.out.println("Processing please wait....!");
    Thread.sleep(2000);
    System.out.println("Your Age is"+Age);
  }
}
