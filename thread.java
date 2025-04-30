import java.util.*;
class Mtable5 extends Thread{
    int n;
    Mtable5(int n){
        this.n=n;
    }
public void run(){
        for(int i=0;i<n;i++){
            System.out.println("5 x "+i+" = "+(5*i));
        }
    }
}
class prime extends Thread{
    int n;
    prime(int n){
        this.n=n;
    }
    public void run(){
        int count=0,x=0,i=1;
        System.out.println("Prime numbers are: ");
        while(x!=n){
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0 && i!=1){
                System.out.println(i+" ");
                x++;
            }
            i++;
        }
    }
}
class thread{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int muin,primen;
        System.out.println("Enter the number n of multiplication ");
        muin=sc.nextInt();
        System.out.println("Enter the number n of prime: ");
        primen=sc.nextInt();
        Mtable5 t1=new Mtable5(muin);
        prime t2=new prime (primen);
        t1.start();
        t2.start();
    }
}