<<<<<<< HEAD
package controller;

import controller.filter.Filter;
import view.View;

/**
 * Created by User on 14.10.2018.
 */

@Deprecated
public class ValidGetter  {
    View view;
    Filter filter;

    public ValidGetter(Controller controller){
        this.view = controller.getView();
        this.filter = new Filter();
    }

    public String getValidName(){
        String name;
        do{
            view.print("INPUT", "NAME");
            name = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", name));
        return name;
    }

    public String getValidSecondname(){
        String secondname;
        do{
            view.print("INPUT", "SECONDNAME");
            secondname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", secondname));
        return secondname;
    }

    public String getValidSurname(){
        String surname;
        do{
            view.print("INPUT", "SURNAME");
            surname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", surname));
        return surname;
    }

    public String getValidNickname(){
        String nickname;
        do{
            view.print("INPUT", "NICKNAME");
            nickname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.nick", nickname));
        return nickname;
    }

    public String getValidComment(){
        String comment;
        do{
            view.print("INPUT", "COMMENT");
            comment = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.line", comment));
        return comment;
    }

    public String getValidHomeNum(){
        String homenum;
        do{
            view.print("INPUT", "HOMENUMBER");
            homenum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.homephone", homenum));
        return homenum;
    }

    public String getValidMobnum1(){
        String mobnum;
        do{
            view.print("INPUT", "MOBNUM1");
            mobnum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.phone", mobnum));
        return mobnum;
    }

    public String getValidMobnum2(){
        String mobnum;
        do{
            view.print("INPUT", "MOBNUM2");
            mobnum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.phone", mobnum));
        return mobnum;
    }

    public String getValidEmail(){
        String email;
        do{
            view.print("INPUT", "EMAIL");
            email = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.mail", email));
        return email;
    }

    public String getValidSkype(){
        String skype;
        do{
            view.print("INPUT", "SKYPE");
            skype = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.skype", skype));
        return skype;
    }

    public String getValidZIP(){
        String zip;
        do{
            view.print("INPUT", "ZIP");
            zip = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.zip", zip));
        return zip;
    }

    public String getValidCity(){
        String city;
        do{
            view.print("INPUT", "CITY");
            city = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.city", city));
        return city;
    }

    public String getValidStreet(){
        String street;
        do{
            view.print("INPUT", "STREET");
            street = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.street", street));
        return street;
    }

    public String getValidHouse(){
        String house;
        do{
            view.print("INPUT", "HOUSE");
            house = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.home", house));
        return house;
    }

    public String getValidFlat(){
        String flat;
        do{
            view.print("INPUT", "FLAT");
            flat = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.flat", flat));
        return flat;
    }

    public void ok(){
        view.print("RESULT");
    }


}
=======
package controller;

import controller.filter.Filter;
import view.View;

/**
 * Created by User on 14.10.2018.
 */


public class ValidGetter  {
    View view;
    Filter filter;

    public ValidGetter(Controller controller){
        this.view = controller.getView();
        this.filter = new Filter();
    }

    public String getValidName(){
        String name;
        do{
            view.print("INPUT", "NAME");
            name = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", name));
        return name;
    }

    public String getValidSecondname(){
        String secondname;
        do{
            view.print("INPUT", "SECONDNAME");
            secondname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", secondname));
        return secondname;
    }

    public String getValidSurname(){
        String surname;
        do{
            view.print("INPUT", "SURNAME");
            surname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.name.en", surname));
        return surname;
    }

    public String getValidNickname(){
        String nickname;
        do{
            view.print("INPUT", "NICKNAME");
            nickname = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.nick", nickname));
        return nickname;
    }

    public String getValidComment(){
        String comment;
        do{
            view.print("INPUT", "COMMENT");
            comment = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.line", comment));
        return comment;
    }

    public String getValidHomeNum(){
        String homenum;
        do{
            view.print("INPUT", "HOMENUMBER");
            homenum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.homephone", homenum));
        return homenum;
    }

    public String getValidMobnum1(){
        String mobnum;
        do{
            view.print("INPUT", "MOBNUM1");
            mobnum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.phone", mobnum));
        return mobnum;
    }

    public String getValidMobnum2(){
        String mobnum;
        do{
            view.print("INPUT", "MOBNUM2");
            mobnum = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.phone", mobnum));
        return mobnum;
    }

    public String getValidEmail(){
        String email;
        do{
            view.print("INPUT", "EMAIL");
            email = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.mail", email));
        return email;
    }

    public String getValidSkype(){
        String skype;
        do{
            view.print("INPUT", "SKYPE");
            skype = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.skype", skype));
        return skype;
    }

    public String getValidZIP(){
        String zip;
        do{
            view.print("INPUT", "ZIP");
            zip = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.zip", zip));
        return zip;
    }

    public String getValidCity(){
        String city;
        do{
            view.print("INPUT", "CITY");
            city = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.city", city));
        return city;
    }

    public String getValidStreet(){
        String street;
        do{
            view.print("INPUT", "STREET");
            street = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.street", street));
        return street;
    }

    public String getValidHouse(){
        String house;
        do{
            view.print("INPUT", "HOUSE");
            house = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.home", house));
        return house;
    }

    public String getValidFlat(){
        String flat;
        do{
            view.print("INPUT", "FLAT");
            flat = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check("check.flat", flat));
        return flat;
    }

    public void ok(){
        view.print("RESULT");
    }


}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
