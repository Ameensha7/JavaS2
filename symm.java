import java.io.*;
import java.util.*;

public class symm {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int r,c,i,j,flag=0;
System.out.println("Enter the number of rows of the matrix : ");
r=sc.nextInt();
System.out.println("Enter the number of coulumns of the matrix : ");
c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter elements of matrix a: ");
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        a[i][j]=sc.nextInt();
    }
}

for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        if(a[i][j]==a[j][i]){
            flag=1;
            break;
        }}}
        if(flag==0)
        {
            System.out.println("a is Symmetric");
        }
        else
        {
            System.out.println("a is Asymmetric");
        } 
sc.close();
}
}