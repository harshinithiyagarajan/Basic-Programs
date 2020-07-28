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
public class count {
    public static void main(String[] args){
        int pos=0,neg=0,ero=0;
        Scanner obj =new Scanner(System.in);
        System.out.println("enter no of integers:");
        int n=obj.nextInt();
        System.out.println("enter integers");
        for(int i=0;i<n;i++){
        int[] a=new int[n];
            a[i]=obj.nextInt();
            if(a[i]>0)
                pos++;
            else if(a[i]<0)
                neg++;
            else
                ero++;
        }
        System.out.println("positive nos:"+pos+"  negative nos:"+neg+"   ero:"+ero);
        
        
    }
    
}
