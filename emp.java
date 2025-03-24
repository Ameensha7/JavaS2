import java.util.*;
class Employee{
    int eNo;
    String eName;
    double eSalary;
    Employee(int eNo,String eName,double eSalary){
        this.eNo=eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
}
class emp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of employees: ");
        int n=sc.nextInt();
        Employee[] emps=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter eNo: ");
            int eNo=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter eName: ");
            String eName=sc.nextLine();
            System.out.println("Enter eSalary: ");
            double eSalary=sc.nextDouble();
            emps[i]=new Employee(eNo,eName,eSalary);
        }
            System.out.println("Enter eNo. to search: ");
            int s=sc.nextInt();
            for(int i=0;i<n;i++){
                if(emps[i].eNo==s){
                    System.out.println("eNo: " +emps[i].eNo+ " eName: " +emps[i].eName+ " eSalary: " +emps[i].eSalary);
                }
            }
        }
        }
