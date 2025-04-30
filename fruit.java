import java.util.*;
class fruit{
    public static void main(String args[]){
        ArrayList<String>fruits=new
        ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Strawberry");
        fruits.add("Pomogrenate");
        fruits.add(3,"Avocado");
        System.out.println("ORIGINAL List");
        System.out.println("--------------------------");
        for(String str:fruits){
            System.out.println(str+" ");
        }
        fruits.remove("Avocado");
        fruits.remove(2);
        System.out.println("REMOVED List: ");
        System.out.println("---------------------------");
        for(String str:fruits){
            System.out.println(str+" ");
        }
        fruits.set(3,"Guava");
        System.out.println("UPDATED List: ");
        System.out.println("---------------------------");
        for(String str:fruits){
            System.out.println(str+" ");
        }
        Collections.sort(fruits);
        System.out.println("SORTED List: ");
        System.out.println("---------------------------");
        for(String str:fruits){
            System.out.println(str+" ");
        }
        System.out.println("Checking List");
        System.out.println("---------------------------");
        System.out.println("Apple is in list: "+fruits.contains("Apple"));
        System.out.println("Lem is in list: "+fruits.contains("Lem"));
        System.out.println("Size of array is: "+fruits.size());
        System.out.println("Object at seconf Position is: "+fruits.get(2));
        fruits.clear();
        System.out.println("Final list is: "+fruits);
    }
}