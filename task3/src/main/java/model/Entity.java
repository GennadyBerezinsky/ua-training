<<<<<<< HEAD
package model;

import model.entity.*;

import java.util.Date;

/**
 * Created by User on 13.10.2018.
 */


public class Entity {
    private Name name;
    private String nickname;
    private String comment;
    private Groups groups;
    private Contacts contacts;
    private Adress adress;
    private Date regDate;
    private Date changeDate;

    private Entity(Builder builder) {
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.comment = builder.comment;
        this.groups = builder.groups;
        this.contacts = builder.contacts;
        this.adress = builder.adress;
        this.regDate = builder.regDate;
        this.changeDate = builder.changeDate;
    }

    public String fullName(){
       return name.outName();
    }

    public String adress(){
        return adress.toString();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name=" + name +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", groups=" + groups +
                ", contacts=" + contacts +
                ", adress=" + adress +
                ", regDate=" + regDate +
                ", changeDate=" + changeDate +
                '}';
    }

    public static class Builder{
        private Name name;
        private String nickname;
        private String comment;
        private Groups groups;
        private Contacts contacts;
        private Adress adress;
        private Date regDate;
        private Date changeDate;

        public Builder(){

        }

        public Builder setName(Name name){
            this.name = name;
            return this;
        }

        public Builder setNicname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public Builder setComment(String comment){
            this.comment = comment;
            return this;
        }

        public Builder setGroups(Groups groups){
            this.groups = groups;
            return this;
        }

        public Builder setContacts(Contacts contacts){
            this.contacts = contacts;
            return this;
        }

        public Builder setAdress(Adress adress){
            this.adress = adress;
            return this;
        }

        public Builder setRegDate(Date regDate){
            this.regDate = regDate;
            return this;
        }

        public Builder setChangeDate(Date changeDate){
            this.changeDate = changeDate;
            return this;
        }

        public Entity build(){
            return new Entity(this);
        }
    }
}
=======
package model;

import model.entity.*;

import java.util.Date;

/**
 * Created by User on 13.10.2018.
 */


public class Entity {
    private Name name;
    private String nickname;
    private String comment;
    private Groups groups;
    private Contacts contacts;
    private Adress adress;
    private Date regDate;
    private Date changeDate;

    private Entity(Builder builder) {
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.comment = builder.comment;
        this.groups = builder.groups;
        this.contacts = builder.contacts;
        this.adress = builder.adress;
        this.regDate = builder.regDate;
        this.changeDate = builder.changeDate;
    }

    public String fullName(){
       return name.outName();
    }

    public String adress(){
        return adress.toString();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name=" + name +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", groups=" + groups +
                ", contacts=" + contacts +
                ", adress=" + adress +
                ", regDate=" + regDate +
                ", changeDate=" + changeDate +
                '}';
    }

    public static class Builder{
        private Name name;
        private String nickname;
        private String comment;
        private Groups groups;
        private Contacts contacts;
        private Adress adress;
        private Date regDate;
        private Date changeDate;

        public Builder(){

        }

        public Builder setName(Name name){
            this.name = name;
            return this;
        }

        public Builder setNicname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public Builder setComment(String comment){
            this.comment = comment;
            return this;
        }

        public Builder setGroups(Groups groups){
            this.groups = groups;
            return this;
        }

        public Builder setContacts(Contacts contacts){
            this.contacts = contacts;
            return this;
        }

        public Builder setAdress(Adress adress){
            this.adress = adress;
            return this;
        }

        public Builder setRegDate(Date regDate){
            this.regDate = regDate;
            return this;
        }

        public Builder setChangeDate(Date changeDate){
            this.changeDate = changeDate;
            return this;
        }

        public Entity build(){
            return new Entity(this);
        }
    }
}
>>>>>>> 2c53b71b2a9897adeff5c7fe99dbf05774097027
