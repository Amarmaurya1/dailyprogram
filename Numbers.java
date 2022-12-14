/*write a program to accept a choice from using and perform 
 * 1 prime Number
 * 2 even an odd Number
 * 3 Armstrong Number
 */
package Exceptions;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Numbers obj=new Numbers();        //object creation
     obj.disp();
	}
   public  void disp()       //display
    {
	  try                   //try block    
	  {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Select the options to perform");
		  System.out.println("Select  1 for prime Number");
		  System.out.println("Select  2 for even an odd Number");
		  System.out.println("Select  3 for Armstrong Number");
		  int choice=sc.nextInt();
		  if(choice==1)              //Nested if-else
		  {
			  primeNumber();           
		  }
		  else if (choice==2)
		  {
			  evenoddNumber();
		  }
		  else if(choice==3)
		  {
			  armstrongNumber();
		  }
		  else 
		  {
			  throw new RuntimeException(" this option  is not available");     //throw statement
		  }
	  }catch(Exception a)            //catch block
	  {
		  System.out.println(a.getMessage());
	  }
   }
private void armstrongNumber() {                    
	// TODO Auto-generated method stub
	try                                     //try block
	{
	int num,s=0,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Armstrong Number");
	System.out.println("Enter the number:");
    num=sc.nextInt();
    int num1=num;
    do                                    //do while block
    {
    	r=num%10;
    	s=s+(r*r*r);                         //calculation
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
    catch(Exception e)                      //catch block
    {
    	System.out.println(e.getMessage()+"/n only Number is accepted");
    }
}
private  void evenoddNumber() {
	// TODO Auto-generated method stub
	try
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("even and odd");
	System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num==2%10){
    	System.out.println(num+"is a even Number");
    }
    else
    {
    	System.out.println(num+"is a odd Number");
    }
    }
	catch(Exception se)
	{
       System.out.println(se.getMessage()+"/n only Number is accepted");	
	}
	}
private void primeNumber() {
	// TODO Auto-generated method stub
	try
	{  	
		Scanner sc=new Scanner(System.in);
		 int i,m=0,flag=0,num;  
		 System.out.println();
		 System.out.println("Enter the Number:");
		 num=sc.nextInt();
		  m=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number");
		   }  
		  }//end of else  
}catch(Exception p) {
     System.out.println(p.getMessage()+"/n only Number is accepted");
}finally
	{
	System.out.println("end");
	}
}
}
