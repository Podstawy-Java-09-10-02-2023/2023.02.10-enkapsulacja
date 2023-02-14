package com.comarch.szkolenia.enkapsulacja;

public class Client {
    private String name;
    String surname;
    private int age;
    private long pesel;

    public Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Zmienilo sie imie !!!");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }
}
