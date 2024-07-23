package com.ironhack;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "John Doe", 30, "Engineer");
        Person person2 = new Person(2, "Jane Smith", 25, "Designer");


        PersonsList personsList = new PersonsList();
        personsList.addPerson(person1);
        personsList.addPerson(person2);

        // Test findByName
        try {
            Person foundPerson = personsList.findByName("John Doe");
            System.out.println("Found person: " + foundPerson);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test clonePerson
        Person clonedPerson = personsList.clonePerson(person1);
        System.out.println("Cloned person: " + clonedPerson);
    }

    }
