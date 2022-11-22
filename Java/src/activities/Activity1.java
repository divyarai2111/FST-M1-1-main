package activities;


public class Activity1 {

    public static void main(String args[]){
        Car obj=new Car();

        //Initialize the values
        obj.make=2014;
        obj.color="Black";
        obj.transmission="Manual";

        //Call the methods in the Car class to print the characteristics of the car,
        //and what happens when you accelerate() and brake().

        obj.displayCharacteristics();
        obj.accelarate();
        obj.brake();

    }

}
