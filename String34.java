
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		for(char d:s.toCharArray())
		{
			if(d=='.')
			count++;
		}
		System.out.println(count);
	}
}
