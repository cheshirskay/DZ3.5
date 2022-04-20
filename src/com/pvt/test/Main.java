package com.pvt.test;

import com.pvt.test.user.User;
import com.pvt.test.utill.CreationOfUserLibraries;
import com.pvt.test.utill.PrintFriendsUtill;

public class Main {

    public static void main(String[] args) {

        User user = CreationOfUserLibraries.creationOfUserLibraries();
        PrintFriendsUtill.printFriend(user);
    }
}
