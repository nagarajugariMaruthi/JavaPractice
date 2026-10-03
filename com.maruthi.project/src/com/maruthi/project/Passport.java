package com.maruthi.project;

public class Passport {

    String passportNumber = "P180773";
}

class PassportName {

    String name = "Maruthi";

    void display(Passport p) {

        System.out.println("Passport Number : " + p.passportNumber);
        System.out.println("Passport Name   : " + name);
    }
}