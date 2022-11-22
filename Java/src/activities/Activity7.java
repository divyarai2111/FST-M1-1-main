package activities;

interface BicycleParts{

    //public int gears: number of gears on the bicycle
    //public int speed: max speed of bicycle
    public int gears=0;
    public int speed=0;

}

interface BicycleOperations{
    //public applyBrake(int decrement): how much to slow down the bicycle by.
    //public speedUp(int increment): how much to speed up the bicycle by.
    public void applyBrake(int decrement);
    public void speedUp(int increment);

}

//Next create the base class Bicycle. It implements both interfaces BicycleParts, BicycleOperations.
class Bicycle implements BicycleParts,BicycleOperations{
    //Initialize the values of gears and currentSpeed in a constructor.
    int gears,currentSpeed;
    Bicycle(int a,int b){
        gears=a;
        currentSpeed=b;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed-=decrement;

    }

    @Override
    public void speedUp(int increment){
        currentSpeed+=increment;

    }

    void bicycleDesc() {
        System.out.println("Gears---" + gears + " CurrentSpeed---" + currentSpeed);
    }
}

class MountainBike extends Bicycle{

    int height;
    void seatHeight(int value){
        height=value;

    }

    MountainBike(int gears, int currentspeed, int height){
        super(gears, currentspeed);
        this.height=height;


    }

    @Override
    void bicycleDesc() {
        System.out.println("Gears---" + gears + " CurrentSpeed---" + currentSpeed+" Seat height--"+height);
    }
}
public class Activity7 {
    public static void main(String args[]){

        MountainBike obj=new MountainBike(3,10,25);
        obj.bicycleDesc();
        obj.speedUp(20);
        obj.applyBrake(5);
        obj.bicycleDesc();


    }
}
