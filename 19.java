import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
static int factorial(int n)
    {
        if (n == 0)
          return 1;
         
        return n*factorial(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
        System.out.println(factorial(5));
	}
}
