import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1=1;
		int n2=2;
		int n3=3;
		if(n3>n2 && n3>n1)
		{
			System.out.println(n3);
		}
		 else if(n2>n1 && n2>n3){
			System.out.println(n2);
		 }
		else{
			System.out.println(n1);
		}
	}
}
