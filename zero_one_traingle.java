/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void zero_one_traingle(int N)
	{
		
		for(int i = 1; i<=N; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
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
		zero_one_traingle(N);
		
	}
}
