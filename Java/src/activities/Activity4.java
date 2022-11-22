package activities;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Activity4 {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of array");
        int len=sc.nextInt();

        int arr[]=new int[len];
        System.out.println("Enter array value");
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }

        insertionSort(arr);
    }

    static void insertionSort(int arr[]){

        System.out.println("Unsorted array");
        for (int h=0;h<arr.length;h++){
            System.out.print(arr[h]+" ");
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }



        System.out.println("\nSorted array");
        for (int h=0;h<arr.length;h++){
            System.out.print(arr[h]+" ");
        }
    }
}
