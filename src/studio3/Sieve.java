package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the value of n?");
		int n = scan.nextInt();
		
		boolean[] integerList = new boolean[n + 1]; //creates array, ignore 0
		
		
		for (int i = 2; i < integerList.length; i++)
		{
			for (int j = 2 * i; j < integerList.length; j += i)
			{
				integerList[j] = true; //if index no. is NOT PRIME, mark as true
			}
		}
		
		System.out.println("Prime numbers less than " + n + ":");
		for (int k = 2; k < integerList.length; k++)
		{
			if (integerList[k] == false)
			{
				System.out.print(k + " ");
			}
		}
		
		
	}

}
