import java.util.*;
class grades
{
  static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter your mark = ");
    int mark= sc.nextInt();
    if (mark<=35) {
      System.out.println("Fail you got C grade");
    }
    else if (mark>=36 && mark<=45) {
      System.out.println("you got B grade");
    }
    else if (mark>=46 && mark<=78) {
      System.out.println("you got A Grade");
    }
    else if (mark>=79 && mark<=100) {
      System.out.println("Excelent A++");
    }
    else if (mark>101 || mark<0) {
      System.out.println("Which College pa you are");
    }
    else {
      System.out.println("Invalid");
    }

  }
}
