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
public class sorting {
    public static void main(String[] args){
        int temp,i,j;
        int[] a=new int[100];
        Scanner obj=new Scanner(System.in);
        System.out.println("enter array sie");
        int n=obj.nextInt();
        System.out.println("enter array elements");
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
