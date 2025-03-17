import java.util.*;
public class rev {
    public static void main(String[] arguments){
        int a,rev,dig;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        rev=0;
        while(a!=0){
            dig=a%10;
            rev=rev*10+dig;
            a/=10; 
        }
        System.out.println("Reverse of the number = " + rev);
    }
}
