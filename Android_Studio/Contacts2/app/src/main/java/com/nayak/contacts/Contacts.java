package com.nayak.contacts;

public class Contacts {
    private int id;
    private int contactNumber;
    private String name;

    public Contacts(int id, String name, int contactNumber) {
        this.id = id;
        this.contactNumber = contactNumber;
        this.name = name;
    }

    public Contacts( String name,int contactNumber) {
        this.contactNumber = contactNumber;
        this.name = name;
    }

    public Contacts() {
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", contactNumber=" + contactNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
