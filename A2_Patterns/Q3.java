
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		
        int sp = n-1;
        int st = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=sp;j>=i;j--)
            {
                System.out.print("\t");
            }
            for(int j=st;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
}}

