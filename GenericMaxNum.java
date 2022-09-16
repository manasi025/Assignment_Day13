//Find Max Integer using Generics
package day13;

import java.util.Scanner;

public class GenericMaxNum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Integer num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 values : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        solve(num1, num2, num3);
	}

	private static void solve(Integer num1, Integer num2, Integer num3) {
		// TODO Auto-generated method stub
		
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0 ) 
		{
			System.out.println(num1 + " is greatest");
		}
		else if (num2.compareTo(num3) > 0) 
		{
			System.out.println(num2 + " is greatest");

		}
		else 
		{
			System.out.println(num3 + " is greatest");
		}
	}

}
