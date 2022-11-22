import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2Test {

    BankAccount bank;
    @Test
    public void notEnoughFunds(){
        //Create an object for the BankAccount and set balance to 10.
        //Add an assertion, assertThrows(), that expects the
        // NotEnoughFundsException custom exception to be thrown.

        bank=new BankAccount(1);
        assertThrows(NotEnoughFundsException.class,()->bank.withdraw(10),"Balance low");


    }

    @Test
    public void enoughFunds(){
        //Create an object for the BankAccount and set balance to 100.
        //Add an assertion, assertDoesNotThrow(),
        // that expects the NotEnoughFundsException custom exception to NOT be thrown.
        bank=new BankAccount(100);
        assertDoesNotThrow(()->bank.withdraw(10));


    }
}
