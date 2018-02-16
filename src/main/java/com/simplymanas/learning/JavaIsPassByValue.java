package com.simplymanas.learning;

public class JavaIsPassByValue {
    public static void  changeName (Person person){
        person.setName("Manas");
        System.out.println(person.getName());
    }

    public static void changePoint(){
        Person person = new Person("Rabi");
        System.out.println(person.getName());
        person.setName("Test");
        System.out.println(person.getName());

    }

    public static void main(String[] args) {
        Person person =  new Person("Lizi");
        System.out.println(person.getName());

        changeName(person);
        System.out.println(person.getName());

        changePoint();
        System.out.println(person.getName());
    }
}

