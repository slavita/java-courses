package ru.Clinics.clinic;

public class Cat implements Pet{

    private String name;

    Cat(final String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
