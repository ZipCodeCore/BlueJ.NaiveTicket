

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TicketMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTest
{
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTest()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void insertMoneyTest(){
        TicketMachine testTicketMachine = new TicketMachine(4);
        
        testTicketMachine.insertMoney(20);
        
        assertEquals(Integer.valueOf(20), testTicketMachine.getBalance());     
    }
    
    @Test
    public void printTicketTest(){
        TicketMachine testTicketMachine = new TicketMachine(13);
        
        assertEquals("Ticket price: 13 cents. Your total is 0.",testTicketMachine.printTicket());
        assertEquals(Integer.valueOf(1), testTicketMachine.getTicketNumber());
        assertEquals(Integer.valueOf(2), testTicketMachine.incrementTicketNumber());
        assertNotEquals(Integer.valueOf(3), testTicketMachine.getTicketNumber());
    }
    
    @Test
    public void printTicketTest2(){
        TicketMachine testTicketMachine = new TicketMachine(40);
        
        assertNotEquals("Ticket price: 13 cents. Your total is 0.", testTicketMachine.printTicket());
        assertEquals(Integer.valueOf(1), testTicketMachine.getTicketNumber());
    }
    
    @Test
    public void incrementTicketNumberTest(){
        TicketMachine testTicketMachine = new TicketMachine(40);
        
        for(int i = 0; i < 10; i++){
            testTicketMachine.printTicket();
    }
    
        assertEquals(Integer.valueOf(10), testTicketMachine.getTicketNumber());
        assertNotEquals(Integer.valueOf(9), testTicketMachine.getTicketNumber());
    }
    
}
