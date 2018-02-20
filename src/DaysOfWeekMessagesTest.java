import org.junit.Test;

import static org.junit.Assert.*;

public class DaysOfWeekMessagesTest {

    @Test
    public void testGetDaysMessage(){

        String  message = "Monday. You couldn't have had it any worse";
        assertEquals(message,DaysOfWeekMessages.getDaysMessage(2));
        assertTrue(DaysOfWeekMessages.getDaysMessage(2) == message);

    }

}