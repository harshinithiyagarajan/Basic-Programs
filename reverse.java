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
public class reverse {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no of array elements");
        int n=obj.nextInt();
        System.out.println("enter array elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.println("reverse array");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
        
    }
    
}
