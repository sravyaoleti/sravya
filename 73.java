import java.util.*;
import java.lang.*;
import java.io.*;
class Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<n&&b>n)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
