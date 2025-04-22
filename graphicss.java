
import java.util.*;
interface shapee{
    double area();
}
class rectangle implements shapee{
    Scanner sc=new Scanner(System.in);
    public double area(){
        System.out.println("Enter the length and breadth");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float area=l*b;
        return(area);
    }
}
class square implements shapee{
    Scanner sc=new Scanner(System.in);
    public double area(){
        System.out.println("Enter the side length");
        float s=sc.nextFloat();
        float area=s*s;
        return(area);
    }
}
class graphicss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice: 1.Rectangle 2.Square");
        int c=sc.nextInt();
        switch(c){
            case 1: 
            rectangle re=new rectangle();
            System.out.println("Area of Rectangle= "+re.area());
            break;
            case 2:
            square sq=new square();
            System.out.println("Area of Square= "+sq.area());
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}