import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
        String a=in.next();
        int c=0;
        for(int i=a.length()-1;i>=0;i--)
        {
           if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
           c++;
        }
        if(c!=0)
            System.out.print("yes");
            else
            System.out.print("no");

	}
}
