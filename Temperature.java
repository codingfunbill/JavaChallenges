import java.util.Scanner;


public class Temperature
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double temp=0;
		double result=0;
		
		System.out.println("Please enter a temperature in C: ");
		temp = input.nextInt();
		
		result = (9.0/5.0)*temp + 32;
		
		System.out.println("The temp is "+result+"F");
	}
}