import java.util.*;
interface shapee{
    void area();
    void perimeter();
}
class circle implements shapee{
    int r;
    Scanner sc=new Scanner(System.in);
    public void area(){
        System.out.println("Enter the radius: ");
    r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("Area of circle="+area);
    }
    public void perimeter(){
        System.out.println("Enter the radius: ");
    r=sc.nextInt();
        double peri=2*Math.PI*r;
        System.out.println("Perimeter of circle="+peri);
    }
}
class rectangle implements shapee{
    int l,b;
    Scanner sc=new Scanner(System.in);
   
    public void area(){
        System.out.println("Enter the length: ");
        l=sc.nextInt();
        System.out.println("Enter the breadth: ");
        b=sc.nextInt();
        double area=l*b;
        System.out.println("Area of Rectangle="+area);
    }
    public void perimeter(){
        System.out.println("Enter the length: ");
        l=sc.nextInt();
        System.out.println("Enter the breadth: ");
        b=sc.nextInt();
        double peri=2*(l+b);
        System.out.println("Perimeter of Rectangle="+peri);
    }
}
class square implements shapee{
    int s;
    Scanner sc=new Scanner(System.in);
    public void area(){
        System.out.println("Enter the side length: ");
    s=sc.nextInt();
        double area=s*s;
        System.out.println("Area of Square="+area);
    }
    public void perimeter(){
        System.out.println("Enter the side length: ");
    s=sc.nextInt();
        double peri=4*s;
        System.out.println("Perimeter of Square="+peri);
    }
}
class interfacee{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu: 1.Circle 2. Rectangle 3. Square");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            circle sh=new circle();
            sh.area();
            sh.perimeter();
            break;
            case 2:
            rectangle re=new rectangle();
            re.area();
            re.perimeter();
            break;
            case 3:
            square sq=new square();
            sq.area();
            sq.perimeter();
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}