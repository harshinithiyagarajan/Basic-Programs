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
public class cgpa {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        double m[]=new double[10];
        double c[]=new double[10];
        double sum =0,csum=0;
        int i;
        System.out.println("enter no of subjects");
        int n=obj.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter credits and marks:"+(i+1));
            m[i]=obj.nextInt();
            c[i]=obj.nextInt();
            sum=sum+m[i]*c[i];
            csum=csum+c[i];
        }
        System.out.println("cgpa is"+(sum/csum));
        
            
        
    }
    
}
