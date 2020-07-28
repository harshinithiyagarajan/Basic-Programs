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
public class discount {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter amount:");
        double amo=obj.nextInt();
        System.out.println("enter discount:");
        double dis=obj.nextInt();
        double ori=amo-(amo/dis);
        System.out.println("original amount:"+ori);
    }
    
}
