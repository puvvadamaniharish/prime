/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		int count = 0;
		char c;
		for (int i=0;i<str.length();i++)
		{ 
			c  = str.charAt(i);
			if (c != ' ')
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
}
