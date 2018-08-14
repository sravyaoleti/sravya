import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,i,avg=0;
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
	    System.out.println(avg);
	}
}
