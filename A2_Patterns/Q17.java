import java.util.*;
public class Assign2
{
    public static void main(String []args)    
    {
        Scanner sc = new Scanner (System.in);
        
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(i<=n/2)
                {
                    for(int k=1;k<=n/2;k++)
                    {
                        System.out.print("  ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                }
                else if(i==n/2+1)
                {
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("* ");
                    }
                }
                else
                {
                    for(int k=1;k<=n/2;k++)
                    {
                        System.out.print("  ");
                    }
                    for(int j=n-i+1;j>=1;j--)
                    {
                        System.out.print("* ");
                    }  
                }
                System.out.println();
            }
        }
    }
