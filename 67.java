import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i<n+10;i++)
        {
            if(i%10==0)
            {
                System.out.print(i);
            }
        }
	}
}
