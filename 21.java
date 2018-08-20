import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArithmeticProgression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),a=sc.nextInt(),d=sc.nextInt();
		System.out.print(n*(2*a+(n-1)*d)/2);
	}
}
