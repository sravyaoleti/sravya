import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String d;
     int n;
     Scanner s=new Scanner(System.in);
     d=s.next();
     n=s.nextInt();
     char a[]=d.toCharArray();
     for(int i=0;i<n;i++){
        System.out.printf("%c",a[i]);
     }
	}
}
