import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailTest {
private Person person;
    @Before
    public void setUp() throws Exception {
        person = new Person("yaseen",10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testToString() {
        try{
            System.out.println(person.toString());
            Assert.fail("Exception not thrown");
        }catch(Exception e){
            Assert.assertFalse("failed",false);
        }
    }
}