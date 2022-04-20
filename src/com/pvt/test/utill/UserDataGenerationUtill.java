package com.pvt.test.utill;

import com.pvt.test.user.UserNameLibrary;

import java.util.Random;

public class UserDataGenerationUtill {

    // Method for generating the users first name

    public static String outputGeneratingNamesUser() {

        int position = (int) (Math.random() * UserNameLibrary.NAME_LIBRARY.length);
        return UserNameLibrary.outputUserNameLibrary(position);
    }

    // Method for generating the users ID
    public static long outputGeneratingIdUser() {

        final long CONSTANT_FOR_GENERATING_ID_USER = 1000000;
        long idUser = (long) (Math.random() * CONSTANT_FOR_GENERATING_ID_USER);
        return idUser;
    }

    // Method for generating the users last name
    public static String outputGeneratingSurnamesUser() {

        final int NUMBER_LETTER_A = 97;
        final int NUMBER_LETTER_Z = 122;
        final int NAME_LENGTH = 5;

        int leftLimit = NUMBER_LETTER_A;
        int rightLimit = NUMBER_LETTER_Z;
        int targetStringLength = NAME_LENGTH;

        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

}
