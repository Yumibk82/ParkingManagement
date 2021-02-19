package Behaviors;

import Entities.Person;

import java.util.ArrayList;

public class PersonManagement {
    ArrayList<Person> persons = new ArrayList<Person>();
    public void add(Person person){
        persons.add(person);
    }
    public Person getPersonById(int id){
        Person person = new Person();
        for (Person p: persons) {
            if(p.getId()==id){
                person =p;
            }
        }
        return person;
    }
    public void show(){
        for (Person p: persons) {
            System.out.println(p.toString());
        }
    }
}
