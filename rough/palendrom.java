import java.util.*;
class palen1
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter the number");
    int paln=sc.nextInt();
    int original=paln;
    int check =0;
    int temp = 0;
    while (paln>0) {
      temp = paln%10;
      check=(check*10)+temp;
      paln = paln/10;

    }
    if (original==check) {
      System.out.println("yes");

    }
    else {
      System.out.println("no");
    }
  }
}
