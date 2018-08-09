import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int i,n,mul;
      Scanner scan=new Scanner(System.in);
      System.out.print("enter the variable ");
      n=scan.nextInt();
      for(i=1;i<=5;i++)
      {
          mul=i*n;
          System.out.println(n+"*"+i+"="+mul);
      }
	}
}
