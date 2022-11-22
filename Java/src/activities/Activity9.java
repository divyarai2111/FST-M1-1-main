package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String args[]){

        //Create an ArrayList named myList of type String.
        ArrayList<String> myList=new ArrayList<>();

        //Add 5 names to the ArrayList using add() method.
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");


        //Then print all the names using for loop.
        for(int i=0;i<myList.size();i++)
            System.out.print(myList.get(i)+" ");

        //Then use get() method to retrieve the 3rd name in the ArrayList.
        System.out.println("\nThird element--"+myList.get(2));

        //Use contains() method to check if a name exists in the ArrayList.
        System.out.println("IS six exists?"+myList.contains("Six"));
        System.out.println("IS One exists?"+myList.contains("One"));

        //Use size() method to print the number of names in the ArrayList.
        System.out.println("Size---"+myList.size());

        //Use remove() method to remove a name from the list and print the size() of the list again.
        myList.remove("Five");
        System.out.println("After removing Five---"+myList.size());




    }
}
