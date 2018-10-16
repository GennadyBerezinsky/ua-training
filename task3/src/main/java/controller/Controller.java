package controller;

import model.Model;
import view.View;



/**
 * Created by User on 13.10.2018.
 */

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public View getView(){
        return view;
    }


    public void controll(){
        view.print("HELLO");
        ValidGetter validGetter = new ValidGetter(this);
        String name = validGetter.getValidName();
        String secondname = validGetter.getValidSecondname();
        view.output(model.out());

        String surname = validGetter.getValidSurname();
        String nickname = validGetter.getValidNickname();
        String comment = validGetter.getValidComment();
        String homephone = validGetter.getValidHomeNum();
        String mob = validGetter.getValidMobnum1();
        String mob2 = validGetter.getValidMobnum2();
        String mail = validGetter.getValidEmail();
        String skype = validGetter.getValidSkype();
        String zip = validGetter.getValidZIP();
        String city = validGetter.getValidCity();
        String street = validGetter.getValidStreet();
        String house = validGetter.getValidHouse();
        String flat = validGetter.getValidFlat();
        view.output(model.adress());

        model.createEntity(name, secondname, surname, nickname, comment, homephone, mob, mob2,
                            mail, skype, zip, city, street, house, flat);
        view.print("RESULT");

        view.print(model.toString());
    }


}
