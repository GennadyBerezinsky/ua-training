package model.entity;

/**
 * Created by User on 13.10.2018.
 */


public class Name {
    private String firstname;
    private String secondname;
    private String surname;

    private Name(Builder builder) {
        this.firstname = builder.firstname;
        this.secondname = builder.secondname;
        this.surname = builder.surname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String outName(){
        char[] carr = firstname.toCharArray();
        return surname + " " + carr[0] + ".";
    }

    public static class Builder{
        private String firstname;
        private String secondname;
        private String surname;

        public Builder(){

        }

        public Builder setFirstname(String firstname){
            this.firstname = firstname;
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

        public Name build(){
            return new Name(this);
        }
    }


}
