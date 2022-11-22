package activities;
//Create an abstract class Book that has:
//title of type String
//an abstract method setTitle() that takes one String argument.
//a concrete method getTitle() that returns the value of title.
abstract class Book{

    String title;

    abstract void setTitle(String title);

    String getTitle(){
        return title;
    }
}
//Create another class that extends the abstract class called MyBook.
//MyBook defines the setTitle() method to assign the value of title as the argument

class MyBook extends Book{

    void setTitle(String str){
        title=str;
    }

}
public class Activity5 {
    public static void main(String args[]){
        //In the main method, create an object of MyBook class - newNovel.
        //Use the setTitle() method to book title to the variable title.
        //Use the getTitle() method to print the name of the book

        MyBook newNovel=new MyBook();
        newNovel.setTitle("The sound of Wolf");
        System.out.println("Title is-----"+newNovel.getTitle());
    }

}
