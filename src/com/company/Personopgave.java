package com.company;

public class Personopgave {
    String personNavn;
    int personAlder;

    public Personopgave(String personNavn, int personAlder){
        this.personNavn = personNavn;
        this.personAlder = personAlder;
    }
    public String getPersonNavn(){
        return personNavn;
    }
    public void setPersonNavn (String personNavn){
        this.personNavn = personNavn;
    }
    public int getPersonAlder(){
        return personAlder;
    }
    public void setPersonAlder(int personAlder){
        this.personNavn = personNavn;
    }

    public String toString(){
        return "Personnavn: " + personNavn + "\nPersonalder: " + personAlder;
    }

    public int hasBirthday() {
        int hasBday = personAlder + 1;
        return hasBday;
    }
}

