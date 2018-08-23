import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+n1[i];
		}
		System.out.print(sum);
		
	}
}
