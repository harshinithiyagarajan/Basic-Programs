/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author Thiagarajan
 */
public class volume {
    public static void main(String[] args){
        box obj=new box(); 
        
        
    }
    
}
class box
{
    int height=10;
    int weight=20;
    int breath=30;
    box()
    {
        int volume=height*weight*breath;
        System.out.println("volume:"+volume);
      
        
    }
    
}

