package controller_new;
/*
 *   Created by Gennady
 *   on 19.10.2018
 */

import model.Model;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public void controll(){
        view.print("HELLO");
        ValidGetter validGetter = new ValidGetter(this);

        String name = validGetter.getValidLine(Command.NAME);
        String secondname = validGetter.getValidLine(Command.SECONDNAME);
        String surname = validGetter.getValidLine(Command.SURNAME);

      //  view.output(model.out());

        String nickname = validGetter.getValidLine(Command.NICKNAME);
        String comment = validGetter.getValidLine(Command.COMMENT);
        String homephone = validGetter.getValidLine(Command.PHONE);
        String mob = validGetter.getValidLine(Command.MOB1);
        String mob2 = validGetter.getValidLine(Command.MOB2);
        String mail = validGetter.getValidLine(Command.EMAIL);
        String skype = validGetter.getValidLine(Command.SKYPE);
        String zip = validGetter.getValidLine(Command.ZIP);
        String city = validGetter.getValidLine(Command.CITY);
        String street = validGetter.getValidLine(Command.STREET);
        String house = validGetter.getValidLine(Command.HOUSE);
        String flat = validGetter.getValidLine(Command.FLAT);

     //   view.output(model.adress());

        model.createEntity(name, secondname, surname, nickname, comment, homephone, mob, mob2,
                mail, skype, zip, city, street, house, flat);
        view.print("RESULT");

        view.output(model.toString());

    }

}
