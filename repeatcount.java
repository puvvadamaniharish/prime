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
	            int k = s.nextInt();
	            int count = 0;
	            int a[] = new int[10];
	            for (int i =0; i < n; i++)
	             {
	             	a[i] = s.nextInt(); 
	             }
	             for (int i =0; i < n; i++)
	             {
	                       if (a[i] == k)
	                       {
	                       	count++;
	                       }
	             }
	             System.out.println(count);
	               
	}
}
