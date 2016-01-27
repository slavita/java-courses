/**
 * Created by Cheater-PC on 27.01.2016.
 */

package ru.lesson11.lesson_test;

public class Users {
    private String name;
    private int id;


    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        return name != null ? name.equals(users.name) : users.name == null;

    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }

}
