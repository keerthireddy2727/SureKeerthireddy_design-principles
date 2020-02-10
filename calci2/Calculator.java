import java.util.*;
public class Calculator {
	double a,b;
	public void read()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	}	
	double add()
	{
	return a+b;
	}
	double sub()
	{
	return a-b;
	}
	double mul()
	{
	return a*b;
	}
	double div()
	{
	return a/b;
	}
	double modulodiv()
	{
	return a%b;
	}
}