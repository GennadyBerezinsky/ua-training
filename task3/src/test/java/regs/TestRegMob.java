<<<<<<< HEAD
package regs;

import controller_new.filter.Filter;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by User on 15.10.2018.
 */


public class TestRegMob {
    String reg = "check.phone";
    Filter filter = new Filter();

    @BeforeClass
    public static void before(){
        System.out.println("test reg for mib num");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "+380673176177"));
    }

    @Test
    public void test2(){
        assertFalse("test2", filter.check(reg, "+3806731761717"));
    }

    @Test
    public void test3(){
        assertFalse("test3", filter.check(reg, "6173177"));
    }

    @Test
    public void test4(){
        assertFalse("test4", filter.check(reg, "+38067317617"));
    }
}
=======
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


public class TestRegMob {
    String reg = "check.phone";
    Filter filter = new Filter();

    @BeforeClass
    public static void before(){
        System.out.println("test reg for mib num");
    }

    @After
    public void after(){
        System.out.println();
    }

    @Test
    public void test1(){
        assertTrue("test1", filter.check(reg, "+380673176177"));
    }

    @Test
    public void test2(){
        assertFalse("test2", filter.check(reg, "+3806731761717"));
    }

    @Test
    public void test3(){
        assertFalse("test3", filter.check(reg, "6173177"));
    }

    @Test
    public void test4(){
        assertFalse("test4", filter.check(reg, "+38067317617"));
    }
}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
