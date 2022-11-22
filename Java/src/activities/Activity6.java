package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    //Add a constructor that initializes
    // the values of maxPassengers and the array passengers to an empty array.
    Plane(int pass){
        this.maxPassengers=pass;
        this.passengers=new ArrayList<>();

    }

    //Add the following methods to the Plane class:
    //onboard(): add passengers to the array using the add() method
    //takeOff(): returns the current date and time
    //land(): sets the value of lastTimeLanded to the current date and time. Also clear() the array.
    //getLastTimeLanded(): returns the value of lastTimeLanded.
    //getPassesngers(): returns the array of passengers.

    void onboard(String passenger){
        this.passengers.add(passenger);
    }

    Date takeOff(){
        return new Date();
    }

    void land() {
        this.passengers.clear();
        this.lastTimeLanded= new Date();
    }
    Date getLastTimeLanded(){
        return this.lastTimeLanded;
    }

    List<String> getPassesngers(){
        return this.passengers;
    }

}

public class Activity6 {
    public static void main(String args[]) throws InterruptedException {
        Plane plane=new Plane(10);
        plane.onboard("Divya");
        plane.onboard("Nikita");
        System.out.println("Takeoff----"+plane.takeOff());
        System.out.println("Passenger--"+ plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plan land time---"+plane.getLastTimeLanded());
        System.out.println("Passenger after landing---"+plane.getPassesngers());

    }
}
