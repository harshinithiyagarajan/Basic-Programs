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
public class custinvoice {
    public static void main(String[] args){
        customer c1=new customer(100,"hari",20);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(10);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        
        customer c2=new customer(101,"pauline",30);
        System.out.println(c2.getid());
        System.out.println(c2.getname());
        System.out.println(c2.getdiscount());
        c2.setdiscount(40);
        System.out.println(c2.getdiscount());
        System.out.println(c2);
        
        invoice v1=new invoice(200,c1,2000);
        customer c3=new customer(201,"bbbb",20);
        System.out.println(v1.getdata());
        System.out.println(v1.getcustomer());
        System.out.println(v1.getamount());
        v1.setamount(30);
        v1.setcustomer(c3);
        System.out.println(v1.getcustomername());
        System.out.println(v1.getamountafterdiscount());
        
        invoice v2=new invoice(400,c2,4000);
        customer c4=new customer(202,"cris",30);
        System.out.println(v2.getdata());
        System.out.println(v2.getcustomer());
        System.out.println(v2.getamount());
        v2.setamount(40);
        v2.setcustomer(c4);
        System.out.println(v2.getcustomername());
        System.out.println(v2.getamountafterdiscount());
    }   
}
class customer
{
    int id;
    String name;
    int dis;
    customer(int n,String a,int d)
    {
        id=n;
        name=a;
        dis=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return dis;
    }
    void setdiscount(int d1)
    {
        dis=d1;
    }
    public String toString() 
    {
        return "ID:"+id+"\nname:"+name+"\ndiscount:"+dis;
    }      
}
class invoice
{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    customer getcustomer()
    {
        return o;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    int getdata()
    {
        return id;
    }
    double getamount()
    {
        return amount;
    }
    void setamount(double d)
    {
        amount =d;
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return amount-(amount)*o.dis/100;
    }
}

