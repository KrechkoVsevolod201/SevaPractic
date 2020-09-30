package ru.ssau.tk.Practice1_1;


public class Person {


    private String firstName;

    private String lastName;

    private int passportId;


    public Person(String firstName, String lastName, int passportId) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.passportId = passportId;

    }

    public String getfirstName() {

        System.out.println(firstName);

        return firstName;

    }


    public void setfirstName(String firstName) {

        this.firstName = firstName;

    }


    public String getlastName() {

        return lastName;

    }


    public void setlastName(String lastName) {

        this.lastName = lastName;

    }


    public int getpassportId() {

        return passportId;

    }


    public void setpassportId(int passportId) {

        this.passportId = passportId;

    }

}