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
		int g[] = new int[10];
		int sum =0;
		int n = s.nextInt();
		for (int i =0;i<n;i++)
		   g[i] = s.nextInt();
		for (int i=0;i<n;i++)
			sum = sum + g[i];
		int k = (sum/n);
		System.out.println(k);
	}
}
