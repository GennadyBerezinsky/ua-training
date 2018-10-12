import org.junit.*;
import ua.training.model.Model;

import javax.jws.WebParam;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 11.10.2018.
 */


public class ModelTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void before(){
        System.out.println("before test case");
    }

    @After
    public void after(){
        System.out.println("after test case");
    }

    /**
     * test ignored. it gives true result but
     * resource-intensive.
     */
    @Ignore
    @Test
    public void testBounds(){
        Model model = new Model();
        for (int i = 0; i < 10000; i++) {

            System.out.printf("test %d/10000\n", i+1);
            assertTrue("number in in bounds", !(model.generate()<=0 && model.generate()>=100));
        }
    }

    /**
     * test ignored. it checks does random has 1 and 99
     * commenting each assert allows to check.
     * if test fails - 1 or 99 was generated.
     */
    @Ignore
    @Test
    public void testMinMax(){
        for (int i = 0; i < 10000; i++) {
            Model model = new Model();
            System.out.printf("test %d/10000\n", i+1);
            assertTrue("1", !(model.getGenerated()==1));
            assertTrue("99", !(model.getGenerated()==99));
        }
    }

    @Test
    public void testCheckNum(){
        System.out.printf("test checkNum()\n");
        Model model = new Model();
        assertTrue("check",model.check(10) == model.getGenerated()-10);
    }

    @Test
    public void testPlusTry(){
        System.out.println("tets plusTry()");
        Model model = new Model();
        int test = model.getTrys()+1;
        model.plusTry();
        int fromModel = model.getTrys();
        assertTrue("plus try", test == fromModel);
    }


    @Test
    public void testNewDia(){
        Model model = new Model();
        int inp = model.generate();
        System.out.println(inp);
        model.checkDiapasone(inp);
        assertTrue("new dia " + model.getGenerated(), !(model.getDiapasoneMax()==inp || model.getDiapasoneMin()==inp));
    }

}
