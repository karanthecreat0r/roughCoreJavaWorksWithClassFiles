import java.util.*;
class prime
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter the number till which prime number to be printed:");
    int num=sc.nextInt();
    System.out.print("Printing pirime numbers from 1 to" +num);
    for (int start=2;start <=num ;start++ ) {
      if (isPrime(start)) {
        System.out.println(start);

      }

    }
  }
  public static boolean isPrime(int start){
    for (int i=2;i<start ;i++ ) {
      if (start%i==0) {
        return false;

      }


    }
    return true;
  }
}
