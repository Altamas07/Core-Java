package com.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingsInhidi {

    public static void main(String[] args) {

        // English
        Locale enLocale = new Locale("en","US");
        ResourceBundle eBundle = ResourceBundle.getBundle("com.internationalization.Messages", enLocale);
        System.out.println("English:");
        System.out.println(eBundle.getString("greeting"));
        System.out.println(eBundle.getString("farewell"));
        System.out.println("--------------------");

        // Hindi
        Locale hiLocale = new Locale("hi","IN");
        ResourceBundle hBundle = ResourceBundle.getBundle("com.internationalization.Messages", hiLocale);
        System.out.println("Hindi:");
        System.out.println(hBundle.getString("greeting"));
        System.out.println(hBundle.getString("farewell"));
    }
}
