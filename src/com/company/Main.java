package com.company;

public class Main {

    public static void main(String[] args) {
	Personopgave person = new Personopgave("Adam", 20 );

    int pA = person.getPersonAlder();

    String pN = person.getPersonNavn();

    int hasBirthday = person.hasBirthday();

        System.out.println(person.toString());
        System.out.println("Hvis personen har fødselsdag er personen: " + hasBirthday + " år");

    }
}
