package regs;

import controller.filter.Filter;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by User on 15.10.2018.
 */


public class TestZip {
    String reg = "check.zip";
    Filter filter = new Filter();

    @BeforeClass
    public static void before(){
        System.out.println("start testing reg for zip");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "12345"));
    }

    @Test
    public void test2(){
        assertFalse("test2", filter.check(reg, "qwert"));
    }

    @Test
    public void test3(){
        assertFalse("test3", filter.check(reg, "1234"));
    }

    @Test
    public void test4(){
        assertFalse("test4", filter.check(reg, "123456"));
    }

    @Test
    public void test5(){
        assertFalse("test5", filter.check(reg, " "));
    }

    @Test
    public void test6(){
        assertFalse("test6", filter.check(reg, "023 45"));
    }
}
