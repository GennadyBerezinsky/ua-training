package model.entity;

/**
 * Created by User on 13.10.2018.
 */


public class Adress {
    private String zip;
    private String city;
    private String street;
    private String house;
    private String flat;

    private Adress(Builder builder) {
        this.zip = builder.zip;
        this.city = builder.city;
        this.street = builder.street;
        this.house = builder.house;
        this.flat = builder.flat;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static class Builder{
        private String zip = "";
        private String city = "";
        private String street = "";
        private String house = "";
        private String flat = "";

        public Builder(){
        }

        public Builder setZip(String zip){
            this.zip = zip;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Builder setStreet(String street){
            this.street = street;
            return this;
        }

        public Builder setHouse(String house){
            this.house = house;
            return this;
        }

        public Builder setFlat(String flat){
            this.flat = flat;
            return this;
        }

        public Adress build(){
            return new Adress(this);
        }
    }
}
