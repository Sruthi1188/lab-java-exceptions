package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class PersonsList{
        private List<Person> persons;
        public PersonsList(){
            persons = new ArrayList<>();
        }
        public void addPerson(Person person){
            persons.add(person);
        }

    public Person findByName(String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        throw new IllegalArgumentException("Person with name '" + name + "' not found.");
    }

    public Person clonePerson(Person original) {
        return new Person(original.getId(), original.getName(), original.getAge(), original.getOccupation());
    }

}




