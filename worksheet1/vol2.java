/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package har.worksheet2;

/**
 *
 * @author Thiagarajan
 */
public class vol2 {
    public static void main(String[] args){
        box1 obj1=new box1();
        box2 obj2=new box2();       
        
    }
}
class box1
{
    double height=10;
    double weight=20;
    double breath=30;
    box1()
    {
        double volume=height*weight*breath;
        System.out.println("volume 1:"+volume);
    }
}
class box2
{
    int height=1;
    int weight=2;
    int breath=3;
    box2()
    {
        int volume=height*weight*breath;
        System.out.println("volume 2:"+volume);
    }

}
        
