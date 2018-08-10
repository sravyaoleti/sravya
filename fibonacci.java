import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int a=1,b=1;
     int c;
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();

      for(int i=0;i<n;i++){
          System.out.println(a);
          c=a+b;
          a=b;
          b=c;
      }
	}
}
