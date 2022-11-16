//*Write a Program to accept a no from the user and if no is even than find out the square

import java.util.Scanner;

public class If_demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		even_squr();
	}
	
	public static void even_squr()
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numbers");
		num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("The square is ="+ (num1*num1));
		}
		
	}
}