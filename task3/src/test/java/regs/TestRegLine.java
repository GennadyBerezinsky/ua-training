package regs;

import controller.filter.Filter;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by User on 15.10.2018.
 */


public class TestRegLine {
    Filter filter = new Filter();
    String reg = "check.line";

    @BeforeClass
    public static void before(){
        System.out.println("test reg line");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "this is somew text to check. lets roll, ok"));
    }

    @Test
    public void  test2(){
        assertTrue("test2", filter.check(reg, " "));
    }


}
