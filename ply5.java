import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class wifi
{
	
	
	int value(char r){
        if (r=='I')
            return 1;
        if (r=='V')
            return 5;
        if (r=='X')
            return 10;
        if (r=='L')
            return 50;
        if (r=='C')
            return 100;
        if (r=='D')
            return 500;
        if (r=='M')
            return 1000;
        return -1;}
    int romanToDecimal(String str){
        int res = 0;
        for (int i=0; i<str.length(); i++){
            int s1 = value(str.charAt(i));
            if (i+1 <str.length()){
                int s2 = value(str.charAt(i+1));
                if (s1 >= s2)
                    res = res + s1;
                else{
                    res = res + s2 - s1;
                    i++;}
            }
            else{
                res = res + s1;
                i++;
            }}
        return res;}

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.next().toUpperCase();
		wifi obj=new wifi();
		System.out.println(obj.romanToDecimal(s));

	}
}
