

class cpu{
    int price;
    cpu(int p){
        price=p;
    }
    class processor{
        int cores;
        String Manufacturer;
        processor(int x,String m){
            cores=x;
            Manufacturer=m;
        }
        void display(){
            System.out.println("Number of cores:"+cores);
            System.out.println("Manufacturer ofprocessor:"+Manufacturer);
        }
    }
    static class ram{
        int memory;
        String Manufacturer;
        ram(int g,String s){
            memory=g;
            Manufacturer=s;
        }
        void display(){
            System.out.println("Memory:"+memory);
            System.out.println("Manufacturer of RAM:"+Manufacturer);
        }
    }
    void display(){
        System.out.println("Price of CPU:"+price);
    }
}

class c{
    public static void main(String args[]){
        cpu abc=new cpu(222000);
        cpu.processor np=abc.new processor(3,"intel");
        cpu.ram rm=new cpu.ram(8,"acer");
        abc.display();
        np.display();
        rm.display();
    }
}