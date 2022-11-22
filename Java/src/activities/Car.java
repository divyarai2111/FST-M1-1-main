package activities;

public class Car {

    //In the Car class, add these variables:
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //MMake a constructor to initialize tyres to 4 and doors to 4
    public Car(){
        this.tyres=4;
        this.doors=4;
    }

    //displayCharacteristics() - This displays the values of all the variables
    void displayCharacteristics(){
        System.out.println("Color-"+this.color);
        System.out.println("Transmission-"+this.transmission);
        System.out.println("Make-"+this.make);
        System.out.println("Tyres-"+this.tyres);
        System.out.println("Doors-"+this.doors);
    }

    //accelarate() - This prints "Car is moving forward."
    void accelarate(){
        System.out.println("Car is moving forward.");
    }

    //brake() - This prints "Car has stopped."
    void brake(){
        System.out.println("Car has stopped.");
    }




}
