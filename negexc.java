import  java.util.*;
class negexce extends Exception
{
public negexce(String s)
{
super(s);
}
}

 class negexc
 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of Integers to be Inserted");
        int n,i;
        n=sc.nextInt();
        int[] numbers=new int[n];
        try{
            System.out.println("Enter the "+n+" numbers:");
            for(i=0;i<n;i++){
                int num=sc.nextInt();
                numbers[i]=num;
                if(num<0){
                    throw new negexce("Negative numbers are not allowed");
                }
            }
            int sum=0;
            for(i=0;i<n;i++){
                sum+=numbers[i];
            }
            float avg=(float)sum/n;
            System.out.println("Average of given numbers is: "+avg);
        }
        
        catch(negexce ex){
            System.out.println("Exception caught!");
            System.out.println(ex.getMessage());
        }
    }
}