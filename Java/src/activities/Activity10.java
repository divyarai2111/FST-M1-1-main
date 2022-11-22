package activities;

import java.awt.desktop.SystemEventListener;
import java.util.HashSet;

public class Activity10 {

    public static void main(String args[]){
        //Create a HashSet named hs.


        HashSet<String> hs= new HashSet<>();

        //Add 6 objects using add() method to the HashSet.
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        hs.add("Six");

        //Then print the size of the HashSet using the size() method.
        System.out.println("Size of hashset "+hs.size());

        //Remove an element using the remove() method.
        System.out.println("Remove Six- existing"+hs.remove("Six"));

        //Also try to remove an element that is not present in the Set.
        System.out.println("Remove Seven- non existing"+hs.remove("Seven"));

        //Use the contains() method to check if an item is in the Set or not.
        System.out.println("Remove One- existing"+hs.contains("One"));
        System.out.println("Remove Ten- non existing"+hs.contains("Ten"));

        //Print the updated set.
        System.out.println(hs);


    }
}
