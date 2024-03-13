package org.example;

import java.util.Random;

public class SingeltonPassword {






     static public boolean containsAtLeast8Characters(String password) {
        return password.length() >= 8;
    }

    static public boolean containsDigits( String password) {
        return password.matches(".*[0-9].*");
    }

    static public boolean containsUpercaseAndLowercase(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    static public boolean containsACommonlyUsedPasswords(String password) {
         String[] commonsPasswords = {"1234","Password1"};

       for ( String pass : commonsPasswords )
           if(password.equals(pass))return false;
        return true;
    }

    static public boolean containsSpecialCharacters(String password) {
        return password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*");
    }









    static public boolean isValidation(String password) {

        System.out.println("----------------------------------");
        System.out.println("CheckPasswordValidation");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Password : "+password);
        System.out.println("");

        System.out.println("CheckIfStringContains.atLeast8Characters : " + containsAtLeast8Characters(password));
        System.out.println("CheckIfStringContains.containsDigits : " + containsDigits(password));
        System.out.println("CheckIfStringContains.uppercaseAndLowercase : " + containsUpercaseAndLowercase(password));
        System.out.println("CheckIfStringContains.specialCharacters : " + containsSpecialCharacters(password));


        return  containsAtLeast8Characters(password) &&
                containsDigits(password)  &&
                containsUpercaseAndLowercase(password) &&
                containsSpecialCharacters(password)  &&
                containsACommonlyUsedPasswords(password);
    }






    static public String generatePassword() {

        Random random = new Random();
        //random.nextInt(max - min + 1) + min
        int digits = random.nextInt(999 - 100 + 1) + 100;

        String SALTupCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SALTLOWERCHARS = "abcdefghijklmnopqrstuwvxyx";

        String SALTspecialCHARS = "!@#$%&*()_+=|<>?{}\\[\\]~-";

        StringBuilder saltup = new StringBuilder();
        StringBuilder sallower = new StringBuilder();
        StringBuilder salspecial = new StringBuilder();


        while (saltup.length() < 3) { // length of the random string.
            int index = (int) (random.nextFloat() * SALTupCHARS.length());
            saltup.append(SALTupCHARS.charAt(index));

            int index2 = (int) (random.nextFloat() * SALTLOWERCHARS.length());
            sallower.append(SALTLOWERCHARS.charAt(index2));

            int index3 = (int) (random.nextFloat() * SALTspecialCHARS.length());
            salspecial.append(SALTspecialCHARS.charAt(index3));
        }

        String uppercase = saltup.toString();
        String lowercase = sallower.toString();
        String special = salspecial.toString();

        return digits + uppercase + lowercase +  special ;
    }
}
