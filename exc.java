import java.io.*;
import java.util.*;
class userExc extends Exception{
    public userExc(String s){
        super(s);
    }
} 
class exc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String uname,pass;
        try{
            System.out.println("Enter Username");
            uname=sc.nextLine();
            if(uname==""){
                throw new userExc("No Username!");
            }
            if(uname.length()<8){
                throw new userExc("Greater than 8 characters!");
            }
        }
        catch(userExc e){
            System.out.println("Username Error");
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Enter Password");
            pass=sc.nextLine();
            if(pass==""){
                throw new userExc("No Password!");
            }
            if(pass.length()<8){
                throw new userExc("Weak Password!");
            }
        }
        catch(userExc es){
            System.out.println("Password Error");
            System.out.println(es.getMessage());
        }
    }
}