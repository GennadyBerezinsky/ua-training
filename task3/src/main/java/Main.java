<<<<<<< HEAD
import controller_new.Controller;
import model.Model;
import view.View;

/**
 * Created by User on 13.10.2018.
 */

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(model, view);
        controller.controll();


    }
}
=======
import controller.Controller;
import model.Model;
import view.View;

/**
 * Created by User on 13.10.2018.
 */


public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(model, view);
        controller.controll();


    }
}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
