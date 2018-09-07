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
		String str1 = s.nextLine();
		int k = str.compareTo(str1);
		int m = str.length();
		int n = str1.length();
	//	System.out.println(n);
		if (k == 0)
		{
			System.out.println(str);
		}
	   else if (k > 0)
		{
			System.out.println(str);
		}
		else
		{
			System.out.println(str1);
		} 
	/*	if (m > n)
		   System.out.println(str);
		   else if (m == n)
		     System.out.println(str);
		     else
		     System.out.println(str1);   */
	}
}
