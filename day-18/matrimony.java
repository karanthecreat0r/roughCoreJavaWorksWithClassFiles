import java.util.*;
class Martimony
{
  static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter your Agr Here =");
    int age = sc.nextInt();
    if (age>=18 && age<=39) {
      System.out.println("Hureeyyyy!!! You Are Eligable");
      System.out.println("Welcome To The Hell");
      System.out.print("\uD83D\uDE00");
    }
    else if (age <17) {
      System.out.println("I Can Understand YOur Pain Bro....Please Wait");
    }
    else if (age>=40) {
      System.out.println("Why Are You Alive Die Man");      
    }
  }
}
