/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void Floyd_Traingle(int N)
	{
		int counter = 1;
		for(int i = 1; i<=N; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
			
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		
		int N = timtim.nextInt();
		
		Floyd_Traingle(N);
		
	}
}
