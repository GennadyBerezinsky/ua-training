<<<<<<< HEAD
package model;

import model.entity.Adress;
import model.entity.Contacts;
import model.entity.Groups;
import model.entity.Name;

import java.util.Date;

/**
 * Created by User on 13.10.2018.
 */


public class Model {
    Entity entity;

    public Model(){

    }

    @Override
    public String toString() {
        return entity.toString();
    }

    public String out(){
        return entity.fullName();
    }

    public String adress(){
        return entity.adress();
    }




    public void createEntity(String firstname, String secname, String surname, String nickname, String comment,
                             String homenum, String mob1, String mob2, String mail, String skype, String zip,
                             String city, String house, String street, String flat){

        entity = new Entity.Builder().setName(new Name.Builder().setFirstname(firstname)
                        .setSecondname(secname).setSurname(surname).build()).setNicname(nickname)
                        .setComment(comment).setGroups(Groups.GROUP1).setContacts(new Contacts.Builder()
                        .setHomenumber(homenum).setMobnumber(mob1).setMobnumber2(mob2).setEmail(mail)
                        .setSkype(skype).build()).setAdress(new Adress.Builder()
                        .setZip(zip).setCity(city).setHouse(house).setStreet(street).setFlat(flat).build())
                        .setRegDate(new Date()).setChangeDate(new Date()).build();
    }


}
=======
package model;

import model.entity.Adress;
import model.entity.Contacts;
import model.entity.Groups;
import model.entity.Name;

import java.util.Date;

/**
 * Created by User on 13.10.2018.
 */


public class Model {
    Entity entity;

    public Model(){

    }

    @Override
    public String toString() {
        return entity.toString();
    }

    public String out(){
        return entity.fullName();
    }

    public String adress(){
        return entity.adress();
    }




    public void createEntity(String firstname, String secname, String surname, String nickname, String comment,
                             String homenum, String mob1, String mob2, String mail, String skype, String zip,
                             String city, String house, String street, String flat){

        entity = new Entity.Builder().setName(new Name.Builder().setFirstname(firstname)
                        .setSecondname(secname).setSurname(surname).build()).setNicname(nickname)
                        .setComment(comment).setGroups(Groups.GROUP1).setContacts(new Contacts.Builder()
                        .setHomenumber(homenum).setMobnumber(mob1).setMobnumber2(mob2).setEmail(mail)
                        .setSkype(skype).build()).setAdress(new Adress.Builder()
                        .setZip(zip).setCity(city).setHouse(house).setStreet(street).setFlat(flat).build())
                        .setRegDate(new Date()).setChangeDate(new Date()).build();
    }


}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
