package ru.netology.molchanov;

public class Customer {
    private int id;
    private String firstname;
    private String secondname;
    private String midlname;



    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getMidlname() {
        return midlname;
    }

    public void setMidlname(String midlname) {
        this.midlname = midlname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Customer(int id, String firstname, String secondname, String midlname){
        this.id = id;
        this.firstname = firstname;
        this.secondname = secondname;
        this.midlname = midlname;


    }


    @Override
    public String toString() {
        return "id клиента: " + id + '\'' +
                "Имя: " + firstname + '\'' +
                "Отчество: " + midlname + '\'' +
                "Фамилия: " + secondname + '\'';
    }
}
