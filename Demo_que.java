/* Write a program to accept 2 no from the user find out the greatest value that from that no you have to find out the sum of digit. calculate the factorial of the no.
 */
import java.util.Scanner;

public class Demo_que {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo_que obj=new Demo_que();
		obj.accept_value();

	}
	
	void accept_value()
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		greater(num1,num2);
	}
	void greater(int n1,int n2)
	{
		int val;
		if(n1==n2)
		{
			System.out.println("Both are equal .");
			val=n1;
		}
		else if(n1>n2)
		{
			System.out.println("Num1 is greater:"+n1);
			val=n1;
		}
		else
		{
			System.out.println("Num2 is greater:"+n2);
			val=n2;
		}
		SOD(val);
	}
	
	void SOD(int num)
	{
		int r,s=0;
		do
		{
			r=num%10;
			s=s+r;
			num=num/10;
		}while(num>0);
		System.out.println("The sum of digit "+s);
		fact(s);
	}
	
	void fact(int num)
	{
		int f=1;
		while(num>0)
		{
			f=f*num;
			num--;
		}
		System.out.println("The factorial is ="+f);
		
	}

}