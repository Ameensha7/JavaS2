import java.io.*;
import java.util.*;

class shape{
    public void areas(float r){
        double area=Math.PI*r*r;
        System.out.println("Area of circle: "+area);
    }
    public void areas(int l,int b){
        int area=l*b;
        System.out.println("Area of reactangle: "+area);
    }
    public void areas(int s){
        int area=s*s;
        System.out.println("Area of square: "+area);
    }
}

class area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        shape sh=new shape();
        System.out.println("Area Chart");
        System.out.printf("1.Circle   2.Rectangle   3.Square\n");
        System.out.println("Enter the choice: ");
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.println("Enter the radius of the circle: ");
            float r=sc.nextInt();
            sh.areas(r);
            break;
            case 2: System.out.println("Enter the length and breadth of the rectangle: ");
            int l=sc.nextInt();
            int b=sc.nextInt();
            sh.areas(l,b);
            break;
            case 3: System.out.println("Enter the side of the square: ");
            int s=sc.nextInt();
            sh.areas(s);
            break;
            default:System.out.println("Invalid choice!!!");
        }
    }
}