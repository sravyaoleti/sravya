import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int k=in.nextInt();
		int[]a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
if(a[k]%2!=0){
	System.out.println(a[k]);
}else{
	System.out.println(a[k+1]);
}
	}
}
