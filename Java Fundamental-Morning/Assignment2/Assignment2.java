import java.util.*;
import java.lang.*;
import java.io.*;

class Assignment2
{
    public static void function1() throws ArithmeticException
    {
        int a = 6/0;
    }
    
	public static void main (String[] args)
	{
		try{
		    int p = 6/0;
		}
		catch(ArithmeticException e)
		{
		    System.out.println("ArithmeticException using throw"); 
		}
		
		try{
		    function1();
		}
		catch(ArithmeticException e)
		{
		    System.out.println("ArithmeticException using throws"); 
		}
		
		finally{
            System.out.println("Finally block executed");
		}
		
	}
}
