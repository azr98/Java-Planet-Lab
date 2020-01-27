import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

   as

    @Before
    public void before(){
         bear = new Bear("Volibear", 900, 95.62);
    }

    @Test
    public void hasName(){
        assertEquals("Volibear", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(900, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernate(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernate(){
        Bear thinBear = new Bear("Yogi",22,65);
        assertEquals(false,thinBear.readyToHibernate());
    }
}
