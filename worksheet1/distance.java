/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package har;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class distance {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int x1=obj.nextInt();
        int x2=obj.nextInt();
        int y1=obj.nextInt();
        int y2=obj.nextInt();
        double dis=sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("distance between two points:"+dis);
    }
    
}
