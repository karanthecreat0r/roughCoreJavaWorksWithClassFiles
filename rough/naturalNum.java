import java.util.*;
class naturalnumber
{
  static Scanner sc = new Scanner(System.in);
  static int res,num;
  public static void main(String[] args) {
    System.out.println("Enter any number");
    num=sc.nextInt();
    for (int i=1;i<=num ;i++ ) {
      res =res+i;

    }
    System.out.println("The Natural number of"+num);
    System.out.println(res);

  }
}
