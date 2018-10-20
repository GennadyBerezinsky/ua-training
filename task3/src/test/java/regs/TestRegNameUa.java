package regs;

import controller.filter.Filter;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 14.10.2018.
 */


public class TestRegNameUa {
    Filter filter = new Filter();

    @BeforeClass
    public static void beforeClass(){
        System.out.println();
        System.out.println("Start testing reg for ua name");
    }

    @After
    public void afterTest(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1",filter.check("check.name.ua", "Ім'я"));
    }

    @Test
    public void test2(){
        assertTrue(!filter.check("check.name.ua", "Ыын"));
    }

    @Test
    public void test3(){
        assertTrue(!filter.check("check.name.ua", "I"));
    }

    @Test
    public void test4(){
        assertTrue(!filter.check("check.name.ua", ""));
    }

    @Test
    public void test5(){
        assertTrue(!filter.check("check.name.ua", " "));
    }

}
