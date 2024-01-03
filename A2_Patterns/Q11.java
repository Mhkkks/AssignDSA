package test;

import java.util.*;
public class Assign2
{
    public static void main(String[] args)
    {   
        try(Scanner sc=new Scanner(System.in)){
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=n-2;i++)
        {
           for(int k=n-2;k>=i;k--)
            {
                System.out.print(" ");
            }
           for(int j=1;j<=i;j++)
            {  
                if(j==1)
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }
}      
}
