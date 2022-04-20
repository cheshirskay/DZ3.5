package com.pvt.test.utill;

import com.pvt.test.user.User;

import java.util.LinkedList;
import java.util.List;

public class CreationOfUserLibraries {

    //Method of filling in the data of the user and his friends


    public static User creationOfUserLibraries() {

        final int NUMBER_OF_FRIENDS = 3;

        List<User> Step1 = new LinkedList<>();
        for (int i = 0; i < NUMBER_OF_FRIENDS; i++) {
            List<User> Step2 = new LinkedList<>();
            for (int j = 0; j < NUMBER_OF_FRIENDS; j++) {
                List<User> Step3 = new LinkedList<>();
                for (int k = 0; k < NUMBER_OF_FRIENDS; k++) {
                    List<User> Step4 = new LinkedList<>();
                    for (int l = 0; l < NUMBER_OF_FRIENDS; l++) {
                        List<User> Step5 = FriendNameGenerationUtill.outputGeneratingFriendsNames();
                        Step4.add(new User(UserDataGenerationUtill.outputGeneratingIdUser(),
                                UserDataGenerationUtill.outputGeneratingNamesUser(),
                                UserDataGenerationUtill.outputGeneratingSurnamesUser(),
                                Step5));
                    }
                    Step3.add(new User(UserDataGenerationUtill.outputGeneratingIdUser(),
                            UserDataGenerationUtill.outputGeneratingNamesUser(),
                            UserDataGenerationUtill.outputGeneratingSurnamesUser(),
                            Step4));
                }
                Step2.add(new User(UserDataGenerationUtill.outputGeneratingIdUser(),
                        UserDataGenerationUtill.outputGeneratingNamesUser(),
                        UserDataGenerationUtill.outputGeneratingSurnamesUser(),
                        Step3));
            }
            Step1.add(new User(UserDataGenerationUtill.outputGeneratingIdUser(),
                    UserDataGenerationUtill.outputGeneratingNamesUser(),
                    UserDataGenerationUtill.outputGeneratingSurnamesUser(),
                    Step2));
        }
        User user = new User(UserDataGenerationUtill.outputGeneratingIdUser(),
                UserDataGenerationUtill.outputGeneratingNamesUser(),
                UserDataGenerationUtill.outputGeneratingSurnamesUser(),
                Step1);

        return user;
    }
}
