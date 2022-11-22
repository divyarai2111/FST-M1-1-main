package activities;

import java.util.HashMap;

public class Activity11 {

    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(0,"Red");
        map.put(1,"Yellow");
        map.put(2,"Blue");
        map.put(3,"Green");
        map.put(4,"Yellow");

        //Remove one colour using the remove() method.
        System.out.println("Size before removal "+map.size());
        map.remove(4);

        //Check if the colour green exists in the Map using the containsValue() method.
        System.out.println("Check green?--"+map.containsValue("Green"));

        //Print the size of the Map using the size() method.
        System.out.println("Size after removal "+map.size());
    }
}
