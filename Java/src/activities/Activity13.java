package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String args[]){
        //accept number inputs from the console using Scanner class and store them in an array.
        Scanner scan=new Scanner(System.in);

        //Create an ArrayList object named list.
        ArrayList<Integer> list=new ArrayList<>();
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }


        //Random class to generate an index value
        // and print the value in the array at then generated index value.
        //Create a Random class object named indexGen.
        Random indexGen=new Random();

        //Add a scan statement with nextInt() to accept only integer values,
        //inside a loop to accept multiple values.
        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);

        //Use the hasNextInt() method with the loop to ensure only integer values are accepted.
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        scan.close();
    }
}
