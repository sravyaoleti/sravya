import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		String s=String.valueOf(n);
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	}
}
