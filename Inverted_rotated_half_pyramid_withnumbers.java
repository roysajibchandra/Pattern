/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void Inverted_rotated_half_pyramid(int N)
	{
		for(int i = 1; i<=N; i++)
		{
			for(int j = 1; j<=N-i+1; j++)
			{
				System.out.print(j);
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
		Inverted_rotated_half_pyramid(N);
		
	}
}
