import java.util.*;
import java.lang.*;
import java.io.*;
class prime
{ 
	
	static boolean isPrime(int n)
	{
              if (n <= 1)
              return false;
              for (int i = 2; i < n; i++)
              if (n % i == 0)
              return false;
            return true;
            }
	public static void main (String[] args) throws java.lang.Exception
	{
                if(isPrime(121)) 
                System.out.println("yes") ;
         
         else
         System.out.println("no");
 
                 	
                 }

}
