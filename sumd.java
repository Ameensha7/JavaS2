import java.util.*;
public class sumd {
    public static void main(String[] arguments){
        int a,sum,dig;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        sum=0;
        while(a!=0){
            dig=a%10;
            sum=sum%10+dig;
            a/=10; 
        }
        System.out.println("Sum of the digits = " + sum);
    }
}
