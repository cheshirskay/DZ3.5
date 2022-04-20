package com.pvt.test.user;

public interface UserNameLibrary {
    String[] NAME_LIBRARY = {"Alexander", "Nikolai", "Mikhail", "Lev", "Anton", "Olga", "Kiril", "Zhanna", "Karina",
            "Larisa", "Margarita", "Raisa", "Elina", "Yana", "Kamilla", "Darina", "Vera", "Yaroslav",
            "Eduard", "Semyon", "Matvey", "Artur", "Timur", "Roman", "Alina", "Anna", "Kira"};

    static String outputUserNameLibrary(int position) {
        return NAME_LIBRARY[position];
    }
}
