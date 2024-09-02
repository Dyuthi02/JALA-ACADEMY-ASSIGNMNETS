//6. Write a program to create your own exception

package JALA_ACADEMY_ASSIGNMNETS.Exceptions;

import java.util.*;
public class CreateOwnException
{
	public static void main(String[]args) throws NotEvenNumberException
	{
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		if(n%2==0)
		{
			System.out.print("even");
		}
		else
		{
			throw new NotEvenNumberException("odd");
		}
	}
}
class NotEvenNumberException extends Exception
{
	NotEvenNumberException(String nature)
	{
		super(nature);
	}
}

