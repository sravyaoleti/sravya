import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a;
    int d;
    Scanner s=new Scanner(System.in);
    a=s.next();
    d=s.nextInt();
    String h=new StringBuffer(a).reverse().toString();
    char f[]=h.toCharArray();
    d=d-1;
    for(int i=0;i<f.length;i++){
           if(i==d){
               System.out.println(f[i]);
           }
    
    	
    }

	}
}
