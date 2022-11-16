/*An Armstrong number of three digits is an integer such 
 * that the sum of the cubes of its digits is equal to 
 * the number itself. For example, 371 
 * is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 */
import java.util.Scanner;

public class Armstrong_demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    demo();
	}
    public static void demo()
    {
    	int num,s=0,r;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number:");
        num=sc.nextInt();
        int num1=num;
    	/* Wrong logic{
    
    	num1=n;
    	while(num1>0)
    	{
    		num1=num1/10;
    		num2++;  		
    	}
    	num1=n;
    	while(num1>0)
    	{
    		num1=q%10;
    		res+=(Math.pow(num2, q));
    		num1=num1/10;
    	}*/
        
        do
        {
        	r=num%10;
        	s=s+(r*r*r);
        	num=num/10;
         }
        while(num>0);
        
        if(num1==s)
    	{
    		System.out.println("Given Number is Armstrong");
    	}
    	else
    	{
    		System.out.println("Given Number is not Armstrong");
        }
    	
    	
    	}
    }

