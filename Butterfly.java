/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void butterfly(int N)
	{
		// 1st half
		for(int i = 1; i<=N; i++)
		{
			// stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			// spaces
			for(int j=1; j<=2*(N-i); j++)
			{
				System.out.print("  ");
			}
			// stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		// 2nd half
		for(int i = N; i>=1; i--)
		{
			// stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			// spaces
			for(int j=1; j<=2*(N-i); j++)
			{
				System.out.print("  ");
			}
			// stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		
		int N = timtim.nextInt();
		// int Totalcols = timtim.nextInt();
		butterfly(N);
		
	}
}
