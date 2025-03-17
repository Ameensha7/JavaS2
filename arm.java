import java.util.*;
class arguments
{
    public static void main(String[] arguments) {
        int a,sum,dig;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        int b=a;
        sum=0;
        while(a!=0){
            dig=a%10;
            sum=(sum)+dig*dig*dig;
            a/=10;
        }
        if(b==sum){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
    }
}