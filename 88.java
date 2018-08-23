import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{ 
  static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
 
       
        System.out.println(lcm(x, y));
	}
}
