package activities;

//Create an interface named Addable that contains a single method, add().
// This method accepts two arguments, num1 and num2.

interface Addable {

    int add(int a,int b);

}
public class Activity12 {
    public static void main(String args[]){

        //In this main method, create two variables, both of type Addable(the interface).
        //One variable, say ad1, contains a lambda expression(no body),
        // that saves the result of num1 plus num2.
        Addable ad1=(a,b)->(a+b);
        System.out.println("Addable1 "+ad1.add(100,2));


        //The other variable, say ad2, contains a lambda function(has a body),
        // that also saves the result of num1 plus num2.
        Addable ad2=(int a, int b)->{
            return a+b;
        };
        System.out.println("Addable2 "+ad2.add(200,4));


    }
}
