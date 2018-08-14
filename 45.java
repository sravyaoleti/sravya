import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int N,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("");
		N=sc.nextInt();
		while(N!=0)
		{
			N/=10;
			count++;
		}
		System.out.println(count);
	}
}
