package ru.ssau.tk.Practice1_13;
import ru.ssau.tk.Practice1_2.Code.Person;
public class Check {
    public static void main(String[] args) {
        Person person = new Person();/*Создала объект в среде main*/
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getfirstName());/*Вывела объект в main*/
    }

    private static void checkAnotherPerson(Person person) {
        /*объект не используется, тк есть новый инициализированный объект */
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getfirstName());/*Значение*/
    }
}