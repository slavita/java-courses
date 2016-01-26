package ru.Clinics.clinic;

public class Client {
    private String id;
    private Pet pet;

    /**
     * Конструктор.
     * @param id    id клиента.
     * @param pet   питомец клиента.
     */
    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }
    /**
     * Возвращает имя клиента.
     * @return id.
     */
    public String getId() {
        return id;
    }
    /**
     * Задает имя клиента.
     * @param id клиента.
     */
    public void setId(String id){
        this.id = id;
    }
    /**
     * Задать питомца.
     * @param pet питомец.
     */
    public void setPet(Pet pet){
        this.pet = pet;
    }
    /**
     * Возврвщает питомца.
     * @return pet
     */
    public Pet getPet(){
        return pet;
    }
    /**
     * Удаляет питомца.
     */
    public void removePet(){
        this.pet = null;
    }

    @Override
    public String toString() {
        return "Client:" + id  + ", Питомец = " + pet;
    }
}
