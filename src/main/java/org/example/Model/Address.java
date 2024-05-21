package org.example.Model;

import javax.persistence.*;

@Entity
@Table(name = "student_address")
public class Address {
    @Column(name = "House_No")
    private int HNo;
    private String Street;
    private String City;
    private String State;
    @Id
    @Column(length = 6, name = "pincode")
    private String Zip;

    public Address() {}

    public Address(int HNo, String street, String city, String state, String zip) {
        this.HNo = HNo;
        Street = street;
        City = city;
        State = state;
        Zip = zip;
    }

    public int getHNo() {
        return HNo;
    }

    public void setHNo(int HNo) {
        this.HNo = HNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }
}
