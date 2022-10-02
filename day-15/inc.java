import java.util.*;

class INCDECDobSingle {
	public static void main (String[] args) {
		//1. Post-Increment Operator
	double a = -1;
	double b = -1;

	double c = a++ + b; //Here 'a' will not incremented immediately, a++ will still return value 5.
	// c = 5 + 7 and this will evaluate to 12.

	System.out.println("Post- Increment \n c = "+ c);

	//2. Pre-Increment Operator

	double A = 53425435;
	double B = 533457;

	double C = ++A + B; //Here 'a' will be incremented immediately, and ++a will return value 6.
	// C = 6 + 7 and this will evaluate to 13.

	System.out.println("Pre- Increment \n C = "+ C);

	//Example-
	double m = 1, n = 2;

	double o = m++ + n + ++m; // It goes like m++ = 1, n = 2, ++m = 1+ incremented 'm' from m++
	//														 = 1 + (1+m) = 1+ (1+1) = 3
	// o = 1 + 2 + 3 = 6
	System.out.println("Example \n o = "+ o);
	}
}
