import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
    int c;
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   while(a!=1){
       if(a%2!=0){
          c=a;
          break;
       }
       a=a/2;
   }
    System.out.println(a+"\n");
	}
}
