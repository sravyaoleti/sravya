import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayMin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, min;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        min= a[0];
        for(int i = 0; i < n; i++)
        {
           
                 if (a[i] < min) {
            min = a[i];

            }
        }
        System.out.print(""+min);
	}
}
