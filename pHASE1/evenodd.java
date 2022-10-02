import java.util.*;
class EvenOdd
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter the number");
    int number = sc.nextInt();
    String res=(number%2==0)?"Even":"odd";
    System.out.println("The entered number is ="+res);

  }
}
