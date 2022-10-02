import java.util.*;
class addsubmuldiv
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("enter the number 1-");
    int number1=sc.nextInt();
    System.out.println("Enter the number 2-");
    int number2=sc.nextInt();
    System.out.println("choices available are -");
    System.out.println("1.ADD");
    System.out.println("2.SUB");
    System.out.println("3.Divide");
    System.out.println("4.Multiply");
    System.out.println("enter any choice");
    int choice =sc.nextInt();
    System.out.println();
    System.out.println("Your Choice Are");
    System.out.println("Number1-"+number1);
    System.out.println("Number2-"+number2);
    System.out.println("Your choice is-"+choice);
    if (choice==1) {
      System.out.println("Result= "+(number1+number2));
    }
    else if (choice==2) {
      System.out.println("Result= "+(number1-number2));
    }
    else if (choice==3) {
      System.out.println("Result-"+(number1/number2));
      }
      else if (choice==4) {
        System.out.println("Result-"+(number1*number2));
      }
    }
  }
