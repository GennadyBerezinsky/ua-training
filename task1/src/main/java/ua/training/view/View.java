package ua.training.view;

import java.util.Scanner;

/**
 * Created by User on 05.10.2018.
 */


public class View {
    private Scanner scanner;

    private static final String WORLD_ERROR = "Wrong input! Try again. Input only \"world\"";
    private static final String HELLO_ERROR = "Wrong input! Try again. Input only \"hello\"";

    public View(){
        scanner = new Scanner(System.in);
    }

    public String inputString(){
        return scanner.nextLine();
    }


    public void print(String line){
        System.out.println(line);
    }

    public void outError(int type){
        switch (type){
            case 1:
                print(HELLO_ERROR);
                break;
            case 2:
                print(WORLD_ERROR);
                break;
        }
    }
}
