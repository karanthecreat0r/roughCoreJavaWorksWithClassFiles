import java.util.*;
class Kamato
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    System.out.println("Welcome To Kamato Food Order Service Are you Hungry....!\nPlease Selecet A Hotel" +(char)1+"\n");
    System.out.println("1.Al-Saga\n2.Buhari\n3.SS Hydrabadi\n4.Al-Bek");
    int hotel=sc.nextInt();
    switch (hotel)
    {
      case 1:{
        System.out.println("Thankyou For Selecting Al-Saga  \n Please Select Yor Desired Food "+(char)1+"\n");
        System.out.println("1.Dum Biriyani\n2.Chicken chuka\n3.Mutton Biriyani\n4.Prawn Fry");
        int food=sc.nextInt();
        switch (food) {//switch for food
          case 1:{//case for dum biriyani
            int price =120;
            System.out.println("Please Enter The Quantity");
            int qts=sc.nextInt();
            double bill = qts*price;
            System.out.println("Your Total Bill Is="+bill+"\n");
            System.out.println("Please Enter The Payment Mode\n1.Phone Pe\n2.Google pay\n3.Bitcoin\n");
            int payment = sc.nextInt();
            switch (payment) {//switch for payments
              case 1:{//phone pe starts
                System.out.println("Please Enter The Amount: "+bill+"\n");
                double amount =sc.nextDouble();
                if (amount==bill) {//if stisfaction codeing starts with otp in it
                  System.out.println("Please Enter The OTP Showing");
                  Thread.sleep(500);
                  double otp=9999*Math.random()*9999;
                  int check=(int)otp;
                  System.out.println(check);
                  int otp_in=sc.nextInt();
                  if (check==otp_in) {
                    System.out.println("Processing....Please Wait!!");
                    Thread.sleep(3000);
                    System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else if (check!=otp_in) {
                      System.out.println("Entered OTP Is Incorrect");
                    }
                }//if stisfaction codeing ends with otp in it
              }//phone pe ends
              case 2:{//gpay starts
                System.out.println("Please Enter The Amount: "+bill+"\n");
                double amount2p =sc.nextDouble();
                if (amount2p==bill) {//if satisfaction starts
                  System.out.println("Please Enter The OTP Showing");
                  Thread.sleep(500);
                  double otp2p=9999*Math.random()*9999;
                  int check2p=(int)otp2p;
                  System.out.println(check2p);
                  int otp_in2p=sc.nextInt();
                  if (check2p==otp_in2p) {
                    System.out.println("Processing....Please Wait!!");
                    Thread.sleep(3000);
                    System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else if (check2p!=otp_in2p) {
                      System.out.println("Entered OTP Is Incorrect");
                    }
                  }
                }//if satisfaction ends for gpay
                case 3:{
                  System.out.println("Please Enter The Amount: "+bill+"\n");
                  double amount2pp =sc.nextDouble();
                  if (amount2pp==bill) {
                    System.out.println("Please Enter The OTP Showing");
                    Thread.sleep(500);
                    double otp2pp=9999*Math.random()*9999;
                    int check2pp=(int)otp2pp;
                    System.out.println(check2pp);
                    int otp_in2pp=sc.nextInt();
                    if (check2pp==otp_in2pp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(3000);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                        }
                        else if (check2pp!=otp_in2pp) {
                          System.out.println("Entered OTP Is Incorrect");
                  }
                }
              }//switch for paymnet overall 3 types
            }//switch ends for payments
            break;
          }//case for dum biriyani
          case 2:{//case for 2nd food
            int price =180;
            System.out.println("Please Enter The Quantity");
            int qts=sc.nextInt();
            double bill23p = qts2p*price23p;
            System.out.println("Your Total Bill Is="+bill23p+"\n");
            System.out.println("Please Enter The Payment Mode\n1.Phone Pe\n2.Google pay\n3.Bitcoin\n");
            int payment23p = sc.nextInt();
            switch (payment23p) {
              case 1:{//phone pe starts
                System.out.println("Please Enter The Amount: "+bill23p+"\n");
                double amount23p =sc.nextDouble();
                if (amount23p==bill2p) {
                  System.out.println("Please Enter The OTP Showing");
                  Thread.sleep(500);
                  double otp23p=9999*Math.random()*9999;
                  int check23p=(int)otp23p;
                  System.out.println(check23p);
                  int otp_in23p=sc.nextInt();
                  if (check23p==otp_in23p) {
                    System.out.println("Processing....Please Wait!!");
                    Thread.sleep(3000);
                    System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                  }
                  else if (check23p!=otp_in23p) {
                      System.out.println("Entered OTP Is Incorrect");
                }
              }
            }
          }//phone pe ends
          case 2:{//gpay starts
            System.out.println("Please Enter The Amount: "+bill23p+"\n");
                double amount233p =sc.nextDouble();
                if (amount233p==bill23p) {
                  System.out.println("Please Enter The OTP Showing");
                  Thread.sleep(500);
                  double otp233p=9999*Math.random()*9999;
                  int check233p=(int)otp233p;
                  System.out.println(check233p);
                  int otp_in233p=sc.nextInt();
                  if (check233p==otp_in233p) {
                    System.out.println("Processing....Please Wait!!");
                    Thread.sleep(3000);
                    System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                  }
                  else if (check233p!=otp_in233p) {
                     System.out.println("Entered OTP Is Incorrect");
                }
          }//gpay ends
          case 3:{//crypto starts
            System.out.println("Please Enter The Amount: "+bill23p+"\n");
                  double amount233pp =sc.nextDouble();
                  if (amount233pp==bill23p) {
                    System.out.println("Please Enter The OTP Showing");
                    Thread.sleep(500);
                    double otp233pp=9999*Math.random()*9999;
                    int check233pp=(int)otp233pp;
                    System.out.println(check233pp);
                    int otp_in233pp=sc.nextInt();
                    if (check233pp==otp_in233pp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(3000);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else if (check233pp!=otp_in233pp) {
                          System.out.println("Entered OTP Is Incorrect");
                  }
                }
                }//crypto ends
        }//switch for food

      }//swith for hotel ends

    }//hotel switch case ends
  }//main mehod ends
}//class ends
