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
public class calculator {
    public static void main(String[] args){
        int a=10,b=20;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println("addition:"+(a+b));
                break;
            case '-':
                System.out.println("subtraction:"+(a-b));
                break;
            case '*':
                System.out.println("multiplication:"+(a*b));
                break;
            case '/':
                System.out.println("division:"+(a/b));
                break;
            default:
                System.out.println("invalid input");
                break;
            
            
                
        }
    }
    
}
