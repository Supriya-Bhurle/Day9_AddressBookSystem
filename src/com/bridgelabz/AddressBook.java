package com.bridgelabz;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("welcome to address book system program");
        AddressBookMain obj = new AddressBookMain();
        obj.setName("Supriya");
        obj.setSurname("Bhurle");
        obj.setAddress("Samata Colony.");
        obj.setCity("Bramhapuri");
        obj.setState("Maharashtra");
        obj.setContactNumber("935924447");
        obj.setEmail("ssupriyabhurle28@gmail.com");

        System.out.println("Name: " + obj.getName());
        System.out.println("Surname: " + obj.getSurname());
        System.out.println("Address: " + obj.getAddress());
        System.out.println("City: " + obj.getCity());
        System.out.println("State: " + obj.getState());
        System.out.println("ContactNumber: " + obj.getContactNumber());
        System.out.println("Email: " + obj.getEmail());
    }
}
