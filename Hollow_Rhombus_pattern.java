/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void Hollow_Rhombus_pattern(int N)
	{
		// 1st half
		for(int i = 1; i<=N; i++)
		{
			// spaces
			for(int j=1; j<=N-i; j++)
			{
				System.out.print("   ");
			}
			// stars
			for(int j=1; j<=N; j++)
			{
				if(j==1 || i==1 || i==N || j==N)
				{
				System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
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
		Hollow_Rhombus_pattern(N);
		
	}
}
