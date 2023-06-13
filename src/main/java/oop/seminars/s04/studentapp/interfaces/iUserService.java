package oop.seminars.s04.studentapp.interfaces;

import oop.seminars.s04.studentapp.domain.User;

import java.util.List;

public interface iUserService<T>{
    List<T> getAll();
    /**
     * Creates a new user
     * @param firstName Name
     * @param surName Last Name
     * @param age Age
     */
    void create(String firstName, String surName, int age );

}
