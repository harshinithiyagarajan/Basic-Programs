/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class stud {
    public static void main(String[] args){
        student obj[]=new student[10];
        for(int i=0;i<2;i++){
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();       
        }       
    }
}
class student
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter name and department");
        name=obj.next();
        dept=obj.next();
        System.out.println("enter three subjects marks");
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();        
    }
    void markcal()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 || m2<50 || m3<50){
            status="fail";
        }
        else
        {
            if(avg>=80)
                status="first class";
            if(avg>=70 && avg<=79)
                status="second class";
            if(avg>=50 && avg<=69)
                status="third class";
                
        }
            
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("department:"+dept);
        System.out.println("m1:"+m1+"\nm2:"+m2+"\nm3:"+m3);
        System.out.println("average:"+avg);
        System.out.println("status:"+status);
    }
}