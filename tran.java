import java.util.*;
public class tran {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int r,c,i,j;
System.out.println("Enter the number of rows of the matrix : ");
r=sc.nextInt();
System.out.println("Enter the number of coulumns of the matrix : ");
c=sc.nextInt();
int a[][]=new int[r][c];
int t[][]=new int[r][c];
System.out.println("Enter elements of matrix a: ");
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        a[i][j]=sc.nextInt();
    }
}

System.out.println("Transpose of a is: ");
for(i=0;i<r;i++){
    for(j=0;j<c;j++){
        System.out.print(a[j][i]+" ");
    }
    System.out.println();
}    
sc.close();
}
}