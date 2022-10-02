import java.util.*;
class even1
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("enter the number");
    int num= sc.nextInt();
    if ((num%2)==0) {
      System.out.println("Even");


    }
    else {
      System.out.println("odd");
    }

  }
}
