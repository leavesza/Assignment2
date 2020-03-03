import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeoutTest{
private Person person;
    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 100)
    public void testToString() {
        for(int i = 0;i>50;i++){
            System.out.println(person.toString());

        }
    }
}