import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception{
        calculator=new Calculator();
    }


    @Test
    @DisplayName("Simple add should work")
    public void testAdd(){
        assertEquals(8,calculator.add(3,5));
    }

    @Test
    @DisplayName("Simple mult should work")
    public void testMultiply(){
        assertEquals(15,calculator.multiply(3,5));
    }

}
