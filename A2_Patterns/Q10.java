package test;

import java.util.Scanner;

public class Assign2 {

    public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a= n / 2 + 1, b= n / 2 + 1;
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n;j++){
             if(j==a || j==b){
                 System.out.print("*\t");
             }
             else{
                 System.out.print("\t");
             }
         }
         if(i<=n/2){
                 a++;
                 b--;
             }
         else{
                 a--;
                 b++;
             }
         System.out.println("");
         }
  }
 }
