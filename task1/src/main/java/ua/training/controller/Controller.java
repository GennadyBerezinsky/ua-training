package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

/**
 * Created by User on 05.10.2018.
 */


public class Controller {
    private View view;
    private Model model;

    private static final String HELLO_VALIDATOR = "hello";
    private static final String WORLD_VALIDATOR = "world";
    private static final String HELLO_INPUT = "input \"hello\"";
    private static final String WORLD_INPUT = "input \"world\"";

    public Controller(){
        view = new View();
        model = new Model();
    }

    public void run(){

        view.print(HELLO_INPUT);
        String hello = view.inputString();
        while (!model.validate(hello, HELLO_VALIDATOR)){
            view.outError(1);
            hello = view.inputString();
        }

        view.print(WORLD_INPUT);
        String world = view.inputString();
        while (!model.validate(world, WORLD_VALIDATOR)){
            view.outError(2);
            world = view.inputString();
        }

        String concetinateResult = model.concetinate(hello, world);
        view.print(concetinateResult);
    }

}
