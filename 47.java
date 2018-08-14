import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
	Scanner arun=new Scanner(System.in);
	n=arun.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=arun.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[a.length-1]);
	}
}
