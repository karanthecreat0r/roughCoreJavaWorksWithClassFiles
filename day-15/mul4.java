//importing the pachage
import java.util.*;
class multiplication_With_same_Method//giving class name
{
  static Scanner s=new Scanner(System.in); // mentioning scanner class methon
  static int jack = 2;// global variable for variable nem to store jack
  public static void main(String[] args)throws Exception {
    System.out.println("Enter the Number to be multiplied with 2");
    double new1 = s.nextDouble();//reading the user input value
    System.out.println("please wait....!");
    Thread.sleep(3000);//time waiting
    int new3 = ((int)new1*jack);// multiplication occurs
    System.out.println("The ans is = "+new3);//  final output
  }
}
