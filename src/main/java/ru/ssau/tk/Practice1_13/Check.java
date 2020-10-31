package ru.ssau.tk.Practice1_13;

import ru.ssau.tk.Practice1_2.Code.Person;

public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);/*3. Выводится 5, т.к в chekInt() поменялась копия переменной number.*/
        System.out.println(person.getfirstName());/*4. Выводится Oleg т.к объект ссылается на  данные, полученные
        из-за передачи копии адреса объекта.*/
    }

    private static void checkInt(int number) {
        number = 10;/*1. Выводится 10 т.к  копия переменной int number ссылается  на значение 10.*/
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");/*2. Выводится Oleg  т.к передаётся копия ссылки на объект и указывает на тот же объект.*/
        System.out.println(person.getfirstName());
    }
}