/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package har;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class power {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int i,n=1;    
    System.out.println("enter base number:");
    int a=obj.nextInt();
    System.out.println("enter power:");
    int b=obj.nextInt();
    for(i=0;i<b;i++)
    {
        n=n*a;
    }    
    System.out.println(n);
   
}
    
}
