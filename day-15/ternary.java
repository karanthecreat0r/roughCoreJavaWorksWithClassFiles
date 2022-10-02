import java.util.*;
class LargestOfThree
{
  static Scanner s=new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter the first number");
    int first=s.nextInt();
    System.out.println("Enter the second nuymber");
    int second = s.nextInt();
    System.out.println("Enter thirs number");
    int third = s.nextInt();
    //comparing a and b storing in largest
    int largest=(first>second)?first:second;
    int largest1=(third>largest)?third:largest;
    System.out.println("Largest"+largest1);

  }
}
