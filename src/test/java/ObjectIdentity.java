import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentity {
    private Person person;
    private Person person2;

    @Before
    public void setUp() throws Exception {
        person = new Person();
        person2 = person;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIdentity() {
        Assert.assertEquals(person.getName(),person2.getName());
    }
}