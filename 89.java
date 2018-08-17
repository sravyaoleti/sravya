import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
       String n=s.next();
       char ch[]=n.toCharArray();
       Arrays.sort(ch);
       String m="";
       for(int i=0;i<ch.length;i++)
       {
    	 m+=ch[i];  
       }
       System.out.println(m);

	}
}
