import java.io.*;
import java.util.*;

class Person {
   String name;
   String gender;
   String address;
   int age;
   Person(String name,String gender, String address, int age){
    this.name=name;
    this.gender=gender;
    this.address=address;
    this.age=age;
   } 
}

class Employee extends Person{
    int Empid;
    String c_name;
    String qual;
    int salary;
    Employee(int Empid,String c_name,String qual, int salary,String name,String gender, String address, int age){
        super(name,gender,address,age);
        this.Empid=Empid;
        this.c_name=c_name;
        this.qual=qual;
        this.salary=salary;
    }
}

class Teacher extends Employee{
    int Tid;
    int Did;
    String subject;
    Teacher(int Tid,int Did, String subject,int Empid,String c_name,String qual, int salary,String name,String gender, String address, int age){
        super(Empid,c_name,qual,salary,name,gender,address,age);
        this.Tid=Tid;
        this.Did=Did;
        this.subject=subject;
    }
void displayDetails(){
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("Age: "+age);
    System.out.println("Address: "+address);
    System.out.println("Employee ID: "+Empid);
    System.out.println("Company name: "+c_name);
    System.out.println("Qualification: "+qual);
    System.out.println("Salary: "+salary);
    System.out.println("Teacher ID: "+Tid);
    System.out.println("Department ID: "+Did);
    System.out.println("Subject: "+subject);
}
}
public class person {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Teachers: ");
        n=sc.nextInt();
        Teacher[] te=new Teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" teacher details: ");
            System.out.println("Enter Teacher ID: ");
            int Tid=sc.nextInt();
            System.out.println("Enter Department ID: ");
            int Did=sc.nextInt();
            System.out.println("Enter Subject: ");
            String subject=sc.next();
            System.out.println("Enter Employee ID: ");
            int Empid=sc.nextInt();
            System.out.println("Enter Company name: ");
            String c_name=sc.next();
            System.out.println("Enter Qualification: ");
            String qual=sc.next();
            System.out.println("Enter Salary: ");
            int salary=sc.nextInt();
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Gender: ");
            String gender = sc.next();
            System.out.println("Enter Address: ");
            String address = sc.next();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            teachers[i] = new Teacher(Tid, Did, subject, Empid, c_name, qual, salary, name, gender, address, age);
            teachers[i].displayDetails();
            System.out.println();
        }
    }
}
