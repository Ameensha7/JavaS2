class publisher{
    String name="Shakespear";
}
class book extends publisher{
    String book_name="Julio Ceaser";
}
class Literature extends book{
    String type="literature";
}
class Fiction extends book{
    String type="Fiction";
}
class pub{
    public static void main(String args[]){
        Literature lb=new Literature();
        Fiction fb=new Fiction();
        System.out.println("Fiction book details: ");
        System.out.println("Publisher: " +fb.name+" name is: " +fb.book_name+ " type is: " +fb.type);
        System.out.println("Literature book details: ");
        System.out.println("Publisher: " +lb.name+ " name is: " +lb.book_name+ " type is: " +lb.type);
    }
}
