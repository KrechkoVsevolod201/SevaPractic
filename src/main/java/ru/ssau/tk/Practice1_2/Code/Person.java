package ru.ssau.tk.Practice1_2.Code;

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    public Person(){

    }

    public Person(String firstName){
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId){
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public String getfirstName () {
        System.out.println(firstName);
        return firstName;
    }

    public void setfirstName (String firstName){
        this.firstName = firstName;
    }

    public String getlastName () {
        return lastName;
    }

    public void setlastName (String lastName){
        this.lastName = lastName;
    }

    public int getpassportId () {
        return passportId;
    }

    public void setpassportId ( int passportId){
        this.passportId = passportId;
    }

    public static void main(String[] args){
        Person person1 = new Person();
        person1.setfirstName("Stas");
        person1.setlastName("Baretskiy");
        person1.setpassportId(1975);
        Person person2 = new Person();
        person2.setfirstName("Boris");
        person2.setlastName("Jivotnoe");
        person2.setpassportId(69);

        Person person3 = new Person("Killer");
        Person person4 = new Person("Sosiska");
        Person person5 = new Person(666);


    }
}