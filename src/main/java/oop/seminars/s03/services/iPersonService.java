package oop.seminars.s03.services;

import java.util.List;

public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}