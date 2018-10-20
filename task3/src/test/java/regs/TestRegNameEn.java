package regs;

import controller.filter.Filter;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by User on 15.10.2018.
 */


public class TestRegNameEn {
    Filter filter = new Filter();
    String reg = "check.name.en";

    @BeforeClass
    public static void beforeClass(){
        System.out.println("start testing reg for name in english");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "name"));
    }

    @Test
    public void test2(){
        assertFalse("test 2", filter.check(reg, "n2"));
    }

    @Test
    public void test3(){
        assertFalse("test 3", filter.check(reg, ""));
    }

    @Test
    public void test4(){
        assertFalse("test 4", filter.check(reg, " "));
    }
}
