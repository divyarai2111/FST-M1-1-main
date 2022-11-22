package activities;

public class Activity3 {
    public static void main(String args[]){
        //Create a variable named seconds and initialize it to 1000000000
        double seconds=1000000000;
        //Create variables to store the time of all planets (MercurySeconds, VenusSeconds, etc.)
        double Earth=31557600;
        double Mercury=0.2408467;
        double Venus=0.61519726;
        double Mars=1.8808158;
        double Jupiter=11.862615;
        double Saturn=29.447498;
        double Uranus=84.016846;
        double Neptune=164.79132;



        //Calculate the age on all the planets and print them.
        System.out.println("Your age on earth="+seconds/Earth);
        System.out.println("Your age on Mercury="+(seconds/Earth/Mercury));
        System.out.println("Your age on Venus="+(seconds/Earth/Venus));
        System.out.println("Your age on Mars="+(seconds/Earth/Mars));
        System.out.println("Your age on Jupiter="+(seconds/Earth/Jupiter));
        System.out.println("Your age on Saturn="+(seconds/Earth/Saturn));
        System.out.println("Your age on Uranus="+(seconds/Earth/Uranus));
        System.out.println("Your age on mercury="+(seconds/Earth/Neptune));




    }

}
