package com.pvt.test.utill;

import com.pvt.test.user.User;

import java.util.List;

public class PrintFriendsUtill {

    // Method to display nested list of users friends

    public static void printFriend(User user) {

        List<User> frends = user.getFrends();

        if (frends != null) {
            System.out.print("\n" + user.getName());
            System.out.print(" friends -> " + frends);

            for (int i = 0; i < frends.size(); i++) {
                user = frends.get(i);
                printFriend(user);

            }
        }

    }
}

