import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
     char ch[]=s.toCharArray();
     String s1="";
    String s2="";
    for(int i=0;i<ch.length;i++)
{
	if(i%2==0) {
		s1+=ch[i];
	}
	else
	{
		s2+=ch[i];
	}
}
	System.out.print(s1+" "+s2);

	}
}
