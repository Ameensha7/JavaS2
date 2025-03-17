import java.util.*;
public class matrix {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int r1,c1,r2,c2,i,j;
System.out.println("Enter the size of matrix a: ");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("Enter the size of matrix b: ");
r2=sc.nextInt();
c2=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c1];
System.out.println("Enter elements of matrix a: ");
for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
        a[i][j]=sc.nextInt();
    }
}
System.out.println("Enter elements of matrix b: ");
for(i=0;i<r2;i++){
    for(j=0;j<c2;j++){
        b[i][j]=sc.nextInt();
    }
}
if((r1==r2)&&(c1==c2)){
    for(i=0;i<r1;i++){
        for(j=0;j<c1;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
System.out.println("Resultant matrix is : ");
for(i=0;i<r2;i++){
    for(j=0;j<c2;j++){
        System.out.print("\t"+c[i][j]);
    }
System.out.print("\n");
}
}
else{
    System.out.println("Addition not possible");
}
}
}