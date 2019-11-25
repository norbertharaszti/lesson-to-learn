package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String city;
    private String county;
    private String state;
    private int zip;
    private String email;

    public Person(String firstName, String lastName,
                  String company, String address, String city, String county,
                  String state, int zip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String getEmail() {
        return email;
    }
}
