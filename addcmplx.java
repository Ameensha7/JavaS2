class complex {
    int r;
    int c;
    complex(int real,int complx)
    {
        r=real;
        c=complx;
    }

void display(){
    System.out.println(r+"+"+c+"i");
}

static void add(int r1,int c1,int r2,int c2){
    int re=r1+r2;
    int co=c1+c2;
    System.out.println("Sum="+re+"+"+co+"i");
}
}

class addcmplx{
    public static void main(String args[]){
        complex first=new complex(4,7);
        complex second=new complex(2,3);
        first.display();
        second.display();
        complex.add(first.r,first.c,second.r,second.c);
    }
}