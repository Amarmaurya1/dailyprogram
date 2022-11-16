//*Write a Program to accept SellingPrice and CostPrice from the user and find out profit or loss.

import java.util.Scanner;

public class else_if_demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		profit_loss();
	}
	
	public static void profit_loss()
	{
		int cost_price,selling_price,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price");
		cost_price=sc.nextInt();
		System.out.println("Enter selling price");
		selling_price=sc.nextInt();
		
		result=selling_price-cost_price;
		if(result==0)
		{
			System.out.println("No profit no loss");
		}
		else if(result>0)
		{
			System.out.println("It is profit="+result);
		}
		else
		{
			System.out.println("It is Loss="+(-result));
		}
	}
}