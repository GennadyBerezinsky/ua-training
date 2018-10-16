package model.entity;

/**
 * Created by User on 13.10.2018.
 */


public class Contacts {
    private String homenumber;
    private String mobnumber1;
    private String mobnumber2;
    private String email;
    private String skype;

    private Contacts(Builder builder){
        this.homenumber = builder.homenumber;
        this.mobnumber1 = builder.mobnumber1;
        this.mobnumber2 = builder.mobnumber2;
        this.email = builder.email;
        this.skype = builder.skype;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "homenumber='" + homenumber + '\'' +
                ", mobnumber1='" + mobnumber1 + '\'' +
                ", mobnumber2='" + mobnumber2 + '\'' +
                '}';
    }

    public static class Builder{
        private String homenumber;
        private String mobnumber1;
        private String mobnumber2;
        private String email;
        private String skype;

        public Builder(){

        }

        public Builder setHomenumber(String homenumber){
            this.homenumber = homenumber;
            return this;
        }

        public Builder setMobnumber(String mobnumber){
            this.mobnumber1 = mobnumber;
            return this;
        }

        public Builder setMobnumber2(String mobnumber2){
            this.mobnumber2 = mobnumber2;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setSkype(String skype){
            this.skype = skype;
            return this;
        }

        public Contacts build(){
            return new Contacts(this);
        }


    }
}
