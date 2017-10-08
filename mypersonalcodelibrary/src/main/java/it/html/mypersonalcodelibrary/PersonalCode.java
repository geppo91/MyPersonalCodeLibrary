package it.html.mypersonalcodelibrary;

import java.util.UUID;

public class PersonalCode {

    public static String generate()
    {
        return UUID.randomUUID().toString();
    }
}
