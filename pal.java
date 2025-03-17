import java.util.*;
public class pal {
    public static void main(String[] arguments) {
        String a,b="",temp;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        a = sc.nextLine();
        temp=a;

        for(i=a.length()-1;i>=0;i--)
        {
        b+=a.charAt(i);
        }
        if(b.equals(temp)){
        System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }
    }
}