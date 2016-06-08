package com.theironyard.javawithclojure.jhporter;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static HashMap<String, User> users = new HashMap<>();
    static ArrayList<Message> messages = new ArrayList<>();


    public static void main(String[] args)
    {

    }



    static void addTestUsers()
    {
        users.put("Alice", new User("Alice", ""));
        users.put("Bob", new User("Bob", ""));
        users.put("Charlie", new User("Charlie", ""));
    }

    static void addTestMessage()
    {
        messages.add(new Message(0, -1, "Alice", "Hello World"));
        messages.add(new Message(1, -1, "Bob", "This is a new Thread"));
        messages.add(new Message(2, 0, "Charlie", "Cool Thread Alice"));
    }
}
