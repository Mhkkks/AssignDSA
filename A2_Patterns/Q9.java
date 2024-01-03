package test;

import java.util.Scanner;

public class Assign2 {

    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);


        for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++) {if(i+j==6 || i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }


            System.out.println();
     }
 }
 }
