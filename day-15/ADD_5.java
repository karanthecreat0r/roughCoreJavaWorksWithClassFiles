import java.util.*;
class C3
{
  static Scanner s=new Scanner(System.in);
  static double price=25000;
  public static void main(String[] args) {
    System.out.println("The 1st mobile price is 25000 + tell us the headphone price");
    int add=s.nextInt();
    double mac=((double)price+add);
    System.out.println("The total amount is ="+mac);
  }
}
