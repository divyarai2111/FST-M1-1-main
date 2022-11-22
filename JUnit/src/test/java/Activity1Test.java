import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1Test {


    public static ArrayList<String> list;

    @BeforeEach
    public void setUp() throws Exception{
        list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
    }

    //Create 2 @Test methods, insertTest() and replaceTest().
    //Write an assertion to check the size of the ArrayList. The expected value is 2.
    @Test
    public void insertTest(){
        assertEquals(2,list.size());
        list.add("Three");
        assertEquals(3,list.size());
        assertEquals("One",list.get(0),"Wrong element");
    }

    @Test
    public void replaceTest(){
        list.set(1, "charlie");

        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
    }

}
