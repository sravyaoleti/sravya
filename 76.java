import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{  
			if(num%i==0)
			{
				count++;
			}
		}if(count>2)
			{
				System.out.println("yes");
			}else
				System.out.println("no");
	}
}
