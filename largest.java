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
public class largest {
    public static void main(String[] args){
        int a,b,c;        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("a is greater"+a);
        else if(b>c && b>a)
            System.out.println("b is greater"+b);
        else
            System.out.println("c is greater"+c);
        
    }
    
}
