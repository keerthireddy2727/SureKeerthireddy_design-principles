import java.util.*;
public class SimpleCalci extends Calculator {
	    public static void main ( String []args ) {
	Calculator ob = new Calculator();
	double s;
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulo Division");
	System.out.println("6.Exit");
	Scanner sc = new Scanner(System.in);	
	        int ch;
	System.out.println("Enter your choice : ");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:ob.read();
		 s = ob.add();
		System.out.println("Sum : "+s);
		break;
	case 2:ob.read();
		s=ob.sub();
		//int sub;
		System.out.println("Sub : "+s);
		break;
	case 3:ob.read();
		s=ob.mul();
		//int mul;
		System.out.println("Mul : "+s);
		break;
	case 4:ob.read();
		s=ob.div();
		//int div;
		System.out.println("Div : "+s);
		break;
	case 5:ob.read();
		s=ob.modulodiv();
		//int rem;
		System.out.println("Remainder : "+s);
		break;
	case 6:System.exit(1);
	default:System.out.println("Invalid Choice");
	}
}
}
		 
		
		