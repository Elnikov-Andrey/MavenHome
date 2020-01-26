import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Test2 {

    @Test
    public void test2() {
        Assert.assertNull("Some wrong", null);
    }

    @Test
    public void test() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("My string");

        Assert.assertFalse(strings.isEmpty());
        Assert.assertEquals(1, strings.size());
        Assert.assertEquals("My string", strings.get(0));
        Assert.assertNotEquals("Mu string", strings.get(0));
    }

    //@Ignore
    @org.junit.Test(expected = RuntimeException.class)
        public void test3 () {
            ArrayList<String> strings = new ArrayList<>();
            strings.add("My string");

            Assert.assertFalse(strings.isEmpty());
            Assert.assertEquals(1, strings.size());
            Assert.assertEquals("My string", strings.get(0));
            Assert.assertNotEquals("Mu string", strings.get(0));
        }
//    void test1(){
//            throw new RuntimeException();
//        }
    }

