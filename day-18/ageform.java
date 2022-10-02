import java.util.*;
class AgeWeight
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter Your age=");
    int age = sc.nextInt();
    System.out.println("Enter thw weight= ");
    int weight = sc.nextInt();
    {
    if (age>18 && weight>30)
      System.out.println("Your are eligable");
      else if (age>18 && weight<30) {
        System.out.println("sorry not eligible");

      }
    }
  }
}
