
import java.util.Scanner;

public class Do_while_demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Restaurant();
	}
	public static void Restaurant()
	{
		System.out.println("Welcome to IT Restaurant :)");
		System.out.println("only Veg");
		int choice;
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{   System.out.println("Starter");
			System.out.println(":Chooose Items");
			System.out.println("1:Item1 ");
			System.out.println("2:Item2");
			System.out.println("3:Item3");
			System.out.println("4:Item4");
			choice=sc.nextInt();

			
			System.out.println("Main course");
			System.out.println(":Chooose Items");
			System.out.println("1:Item1 ");
			System.out.println("2:Item2");
			System.out.println("3:Item3");
			System.out.println("4:Item4");
			choice=sc.nextInt();
			
			System.out.println("Dessert");
			System.out.println(":Chooose Items");
			System.out.println("1:Item1 ");
			System.out.println("2:Item2");
			System.out.println("3:Item3");
			System.out.println("4:Item4");
			choice=sc.nextInt();
				
			System.out.println("Do you want to continue this process y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='y' ||ans=='Y');
		
		System.out.println("Thanks for the order!");
		System.out.println("Thanks for coming :)");
	}

}
