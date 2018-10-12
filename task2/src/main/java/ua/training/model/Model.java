package ua.training.model;

import java.util.ArrayList;

/**
 * Created by User on 09.10.2018.
 */


public class Model {
    private int generated;
    private int diapasoneMin = 0;
    private int diapasoneMax = 100;
    private int trys = 0;
    ArrayList<String> lists;

    public Model(){
        generated = generate();
        lists = new ArrayList<String>();
    }

    public int getTrys() {
        return trys;
    }

    /**
     * Method tested, test ignored as resource-intensive
     * After changing in this method de-ignore test method testBounds()
     *
     * @return random num
     */
    public int generate(){
        return (int)Math.ceil(Math.random()*(diapasoneMax-diapasoneMin-1)+diapasoneMin);
    }

    public int getGenerated(){
        return generated;
    }

    public int getDiapasoneMin() {
        return diapasoneMin;
    }

    public int getDiapasoneMax() {
        return diapasoneMax;
    }

    public int check(int num){
        return generated - num;
    }

    public void plusTry(){
        trys++;
    }

    public void stat(int inp){
        lists.add("trys: " + trys + ", number: " + generated + ", your number: " + inp);
    }

    private void newDiaoasone(int min, int max){
        diapasoneMin = min;
        diapasoneMax = max;
    }

    public boolean checkDiapasone(int input){
        return input > diapasoneMin && input < diapasoneMax;
    }

    public void newDia(int inp){
        if(check(inp)>0){
            newDiaoasone(inp, diapasoneMax);
        }
        if(check(inp)<0){
            newDiaoasone(diapasoneMin, inp);
        }
    }

    public ArrayList<String> getLists() {
        return lists;
    }
}
