import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class amstronginterval
{
	
	
	 static void findArmstrong(int low, int high)
    {
        for (int i = low + 1; i < high; ++i) 
        {
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }
            int pow_sum = 0; 
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
            if (pow_sum == i) 
                System.out.print(i + " ");     
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	 int num1 = 150;
        int num2 = 160;
        findArmstrong(num1, num2);
        System.out.println();
	}
}
