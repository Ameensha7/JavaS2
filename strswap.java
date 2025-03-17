import java.util.*;

class SwapString {
    public static void main(String[] arguments) {
        String a, b, temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string : ");
        a = sc.nextLine();
        
        System.out.print("Enter second string : ");
        b = sc.nextLine();
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("First string = " + a);
        System.out.println("Second string = " + b);
    }
}