import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args)
	{
	int num, num1=0, num2=1, num3, counter;
	Scanner sc=new Scanner(System.in);
	System.out.println("No of terms of fibonacci series");
	num = sc.nextInt();

	counter=0;
	
	while(counter<=num)
	{
		num3=num1+num2;
		
		if(counter>=num)
		{
			break;
		}
		System.out.println(+num3);
		num1=num2;
		num2=num3;
		counter++;
	}
	
	}
}