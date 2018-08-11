import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ob=new Scanner(System.in);
		String name=ob.nextLine();
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(name);
		}
	}
}
