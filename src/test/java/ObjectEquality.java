import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEquality {
private Person person1;
private Person person2;
    @Before
    public void setUp() throws Exception {
       person1 = new Person("Yaseen",19);
       person2 = new Person("Yaseen",19);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquality(){
        Assert.assertEquals(person1.getAge(),person2.getAge());
    }
}