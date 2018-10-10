package ua.training.view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 09.10.2018.
 */


public class View {
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public void outTrys(int trys, int genereted){
        System.out.printf("You guess number %n from %n try\n", genereted, trys);
    }

    public void out(String msg){
        System.out.printf("%s\n", msg);
    }

    public int inputInt(){
        int i = -1;
        while (i<0){
            String s = scanner.nextLine();
            try{
                i = Integer.parseInt(s);
            }catch (NumberFormatException nfe){
                System.out.printf("not a number, try again\n");
            }
        }
        return i;
    }

    public void outList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", i+1, list.get(i).toString());
        }
    }

    public void printDiapasone(int a, int b){
        System.out.printf("input number between %d and %d\n", a, b);
    }



}
