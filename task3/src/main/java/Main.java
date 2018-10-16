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
