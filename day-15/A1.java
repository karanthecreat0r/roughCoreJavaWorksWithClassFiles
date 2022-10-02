import java.util.*;
class A2
{
  static Scanner s=new Scanner(System.in);
  static long add = 100000000;
  public static void main(String[] args)
  {
    System.out.println("Enter the number to add in long");
    long ne1 = s.nextInt();
    long res = (add+ne1);
    System.out.println("The add over all number is"+res);
  }
}
