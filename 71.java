import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		int a=0;
		for(int i=0;i<len/2;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				a++;
			}
		}
		if(a==0)
		  System.out.print("yes");
		 else
		   System.out.print("no");
	}
}     
