import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,count=0,n;
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		int []a=new int[n];
		while(n>0)
		{
			a[i]=n%10;
			n=n/10;
			i++;
			count ++;
		}
		for(i=count;i>=0;i--)
		{
			if(a[i]%2!=0)
			{
				System.out.print(" "+a[i]);
			}
		}

	}
}
