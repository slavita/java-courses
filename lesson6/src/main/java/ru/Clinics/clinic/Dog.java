package ru.Clinics.clinic;

public class Dog implements Pet {

    /**
     * Имя питомца.
     */
    private String name;

    /**
     * Конструктор
     * @param name имя питомца.
     */
    public Dog(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }
}