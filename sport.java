class student{
    String stdname="Ameen";
    double cgpa=5.6;
}
class sports extends student{
    int goals=2;
}
class result extends sports{
    void display(){
        System.out.println("Name: " +stdname+" cgpa: " +cgpa+ " goals: " +goals);
    }
}
class sport{
    public static void main(String args[]){
        result re=new result();
        re.display();
    }
}