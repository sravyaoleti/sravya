import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeInterval
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i =0;
       int num =0;
       String  primeNumbers = "";
       for (i = 1; i <= 10; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(primeNumbers);
	}
}
