import java.util.*;
class Kamatoo
{
  static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) throws Exception {
//Titles For The Front Interface
    System.out.println("Welcome To Kamato Food Order Service Are you Hungry....!\nPlease Selecet A Hotel" +(char)1+"\n");
    System.out.println("1.Al-Saga\n2.Buhari\n3.SS Hydrabadi\n4.Al-Bek");
//Reading the user prefered hotel
    int hotel=sc.nextInt();
//**********************************selecting hotel 1*****************************************
    switch (hotel)
    {
      case 1:
        {
        System.out.println("Thankyou For Selecting Al-Saga  \n Please Select Yor Desired Food "+(char)1+"\n");
        System.out.println("1.Dum Biriyani\n2.Chicken chuka\n3.Mutton Biriyani\n4.Prawn Fry");
        int food=sc.nextInt();
        switch (food)
        {






//
//Selecting 1st Food
          case 1:
          {
            int price =120;
            System.out.println("Please Enter The Quantity");
            int qts=sc.nextInt();
            double bill = qts*price;
            System.out.println("Your Total Bill Is="+bill+"\n");
            System.out.println("Please Enter The Payment Mode\n1.Phone Pe\n2.Google pay\n3.Bitcoin\n");
            int payment =sc.nextInt();
//selecting first payment
//







            switch (payment)
            {
              case 1:
              {
                System.out.println("Please Enter The Amount: "+bill+"\n");
                double amount =sc.nextDouble();
                if (amount==bill)
                {
                  System.out.println("Please Enter The OTP Showing");
                  Thread.sleep(3000);
                  double otp=9999*Math.random()*9999;
                  int check=(int)otp;
                  System.out.println(check);//OTP Display
                  int otp_in=sc.nextInt();
                  if (check==otp_in)
                  {
                    System.out.println("Processing....Please Wait!!");
                    Thread.sleep(3000);
                    System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                  }
                  else if (check!=otp_in)
                  {
                    System.out.println("Entered OTP Is Incorrect");

                  }

                }
                break;
              }
//first payment ended


            }
          }

        }
        }
//********************************ending of sirst hotel**************************************














































        case 2:
          {
          System.out.println("Thankyou For Selecting Buhari  \n Please Select Yor Desired Food "+(char)1+"\n");
          System.out.println("1.Dum Biriyani\n2.Chicken chuka\n3.Mutton Biriyani\n4.Prawn Fry");
          int food=sc.nextInt();
          }
          case 3:
            {
            System.out.println("Thankyou For Selecting ss Hydrabadi  \n Please Select Yor Desired Food "+(char)1+"\n");
            System.out.println("1.Dum Biriyani\n2.Chicken chuka\n3.Mutton Biriyani\n4.Prawn Fry");
            int food=sc.nextInt();
            }
            case 4:
              {
              System.out.println("Thankyou For Selecting Al-Bek  \n Please Select Yor Desired Food "+(char)1+"\n");
              System.out.println("1.Dum Biriyani\n2.Chicken chuka\n3.Mutton Biriyani\n4.Prawn Fry");
              int food=sc.nextInt();
              }


    }

}
}
