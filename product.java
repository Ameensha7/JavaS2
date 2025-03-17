import java.io.*;
import java.util.*;
public class product
{
    int pcode;
    String pname;
    double price;
    void data(int a,String b,double c)
    {
        pcode=a;
        pname=b;
        price=c;
    }
    void display()
    {
        System.out.println(pcode+"\t"+ pname+"\t"+ price);
    }
    static void lowestprice(double p1,double p2,double p3){
        if((p1<p2)&&(p1<p3)){
            System.out.println("Pazham has the lowest price");
        }
        else if((p2<p1)&&(p2<p3)){
            System.out.println("Savaala has the lowest price");
        }
        else{
            System.out.println("Pappadam has the lowest price");
        }
    }

public static void main(String args[]){
        product ob1=new product();
        product ob2=new product();
        product ob3=new product();
        ob1.data(101,"Pazham",50);
        ob2.data(102,"Savaala",60);
        ob3.data(103,"Pappadam",10);
        ob1.display();
        ob2.display();
        ob3.display();
        product.lowestprice(ob1.price,ob2.price,ob3.price);
    }
}