//11. Write a program to find the common values between two arrays

package JALA_ACADEMY_ASSIGNMNETS.Arrays;


import java.util.Scanner;

public class CommonElements 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0,f=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<=i;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            f=0;
			for(int j=0;j<m;j++)
			{
				if(a[i]==b[j])
				{
					f++;
				}
			}
			if(c<=f)
			{
				System.out.print(a[i]+" ");
			}

        }
        sc.close();
    }
}
