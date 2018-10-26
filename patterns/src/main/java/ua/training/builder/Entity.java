package ua.training.builder;

import java.security.KeyStore;

/**
 * Created by User on 26.10.2018.
 */


public class Entity {
    private String name;
    private String secondname;
    private String surname;
    private String nickname;

    private Entity(Builder builder) {
        this.name = builder.name;
        this.secondname = builder.secondname;
        this.surname = builder.surname;
        this.nickname = builder.nickname;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public static class Builder{
        private String name = "";
        private String secondname = "";
        private String surname = "";
        private String nickname = "";

        public Builder(){

        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setSecondname(String secondname){
            this.secondname = secondname;
            return this;
        }

        public Builder setSurname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder setNickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public Entity build(){
            return new Entity(this);
        }
    }
}
