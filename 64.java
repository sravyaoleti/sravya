import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p;
		p=n+m;
		if(p%2==0)
		{
			System.out.print("even");
		}		
		else
		{
			System.out.print("odd");
		}

	}
}
