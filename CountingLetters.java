import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountingLetters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String test = "laptop is good";
		count(test);
	}
	
	
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
		}
		
		System.out.println("" + letter);
	}
}

