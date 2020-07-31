/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package har.worksheet2;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class arithmatic {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter two integers");
        int a=obj.nextInt();
        int b=obj.nextInt();
        arth obj1=new arth(a,b);
        System.out.println("addition:"+obj1.add());
        System.out.println("subtraction:"+obj1.sub());
        System.out.println("multiplication:"+obj1.mult());
        System.out.println("division:"+obj1.div());
    }             
}
class arth
{
    int var1;
    int var2;
    arth(int a,int b)
    {
        var1=a;
        var2=b;
    }
    int add()
    {
        return var1+var2;
    }
    int sub()
    {
        return var1-var2;
    }
    int mult()
    {
        return var1*var2;
        
    }
    int div()
    {
        return var1/var2;
    }
}