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
public class fibonacci {
    public static void main(String[] args){
         int a=0,b=1,c,i,n;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter series limit:");
    n=obj.nextInt();
    System.out.println("fibonscci series");
    System.out.println(a);
    System.out.println(b);
    for(i=1;i<n;i++){
        c=a+b;
        a=b;
        b=c; 
        System.out.println(c); 
    }
        
    }
}
