import java.util.*;

class SwapNumbers {
    public static void main(String[] arguments) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}