package com.pubsystem.domain;

public class Seller {
    private String selID;
    private String selName;
    private String address;
    private String email;

    public Seller(){}

    public Seller(Builder builder){
        this.selID = selID;
        this.selName = selName;
        this.address = address;
        this.email = email;
    }

    public String getSelID() {
        return selID;
    }

    public String getSelName() {
        return selName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{

        private String selID, selName, address, email;

        public Builder selID(String selID) {
            this.selID = selID;
            return this;
        }

        public Builder selName(String selName) {
            this.selName = selName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Seller build() {
            return new Seller(this);
        }

    }

    @Override
    public String toString() {
        return "Seller{" +
                "selID='" + selID + '\'' +
                ", selName='" + selName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
