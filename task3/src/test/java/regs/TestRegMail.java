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


public class TestRegMail {
    Filter filter = new Filter();
    String reg = "check.mail";

    @BeforeClass
    public static void beforeClass(){
        System.out.println("start testing reg for email");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "mail.mail@mail.mail"));
    }

    @Test
    public void test2(){
        assertFalse("test2", filter.check(reg, "mail.mailmail.mail"));
    }

    @Test
    public void test3(){
        assertFalse("test3", filter.check(reg, ""));
    }

    @Test
    public void test4(){
        assertFalse("test4", filter.check(reg, "mail.@123.2"));
    }

    @Test
    public void test5(){
        assertFalse("test5", filter.check(reg, ".@ . "));
    }
}
