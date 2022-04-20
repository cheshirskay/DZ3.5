package com.pvt.test.utill;

import com.pvt.test.user.User;
import com.pvt.test.user.UserNameLibrary;

import java.util.LinkedList;
import java.util.List;

public class FriendNameGenerationUtill {

//Method generation list of users name friends

    public static List<User> outputGeneratingFriendsNames() {

        final int NUMBER_OF_FRIENDS = 3;
        List<User> FriendsNamesArray = new LinkedList<>();

        for (int i = 0; i < NUMBER_OF_FRIENDS; i++) {
            int position = (int) (Math.random() * UserNameLibrary.NAME_LIBRARY.length);
            FriendsNamesArray.add(new User(UserNameLibrary.outputUserNameLibrary(position)));
        }

        return FriendsNamesArray;
    }
}
