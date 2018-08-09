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
		int n = s.nextInt();
		int a = 1;
		int b = 10;
		if (n >= a && n <= b)
		{
			System.out.println("yes");
		}
		else
		  System.out.println("no");
	}
}
