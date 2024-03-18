package ru.netology.molchanov;

public class Customer {
    private String name;
    private int id;
    private String email;
    private String phonnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonnum(){
        return phonnum;
    }

    public void setPhonnum(String phonnum) {
        if (phonnum == null || phonnum.isBlank() || phonnum.length() != 10)
            throw new IllegalArgumentException("Некорректный номер телефона");
        this.phonnum = phonnum;
    }

    public Customer(String name, int id, String email, String phonnum){
        this.name = name;
        this.id = id;
        this.email = email;
        this.phonnum =phonnum;
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public Customer(){

    }
}
