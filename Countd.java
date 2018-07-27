import java.util.*;
import java.lang.*;
import java.io.*;
class Countd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      int count = 0, num =548;
	      while(num != 0)
                 {
                    num /= 10;
                    count++;
                 }
                 System.out.println(count);
		
	}
}
