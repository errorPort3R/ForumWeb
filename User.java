package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 6/8/16.
 */
public class User
{
    String name;
    String password;

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
