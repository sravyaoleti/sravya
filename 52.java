import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
     String c[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     
     for(int i=0;i<a.length;i++){
         if(a[i]==n){
             System.out.println(c[i]);
         }
	}
}
}
