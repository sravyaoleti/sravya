import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
System.out.print("");
int min=sc.nextInt();
int hr=0,min1=0;
if(min>0)
{
if(min<60)
{
	min1=min;
}
else if(min>60)
{
	hr=min/60;
	min1=min%60;
}
System.out.println(hr+":"+min1);
}
else
{
System.out.println("invalid input\n");
}
	}
}
