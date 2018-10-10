package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

/**
 * Created by User on 09.10.2018.
 */


public class Controller implements ConstStrings {
    private Model model;
    private View view;

    public Controller(){
        model = new Model();
        view = new View();
    }

    public void controll(){
        view.out(GREATING_MSG);
        int inp = view.inputInt();
        inp = whileDiapasoneIncorrect(inp);

        while (model.check(inp) != 0){
            model.newDia(inp);
            view.printDiapasone(model.getDiapasoneMin(), model.getDiapasoneMax());
            inp = view.inputInt();
            inp = whileDiapasoneIncorrect(inp);
            model.plusTry();
            model.stat(inp);
        }
        System.out.println(WIN);
        model.stat(inp);
        view.outList(model.getLists());
    }

    private int whileDiapasoneIncorrect(int inp) {
        while (!model.checkDiapasone(inp)) {
            System.out.println(DIA_ONLY);
            inp = view.inputInt();
        }
        return inp;
    }
}
