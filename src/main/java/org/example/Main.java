package org.example;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /* System.out.println("atLeast8Characters");
        System.out.println(CheckIfStringContains.atLeast8Characters("123"));
        System.out.println(CheckIfStringContains.atLeast8Characters("12345678"));

        System.out.println("containsDigits");

        System.out.println(CheckIfStringContains.containsDigits("1dsfdsf23"));
        System.out.println(CheckIfStringContains.containsDigits("dsfdsf"));



        System.out.println("uppercaseAndLowercase");
        System.out.println(CheckIfStringContains.uppercaseAndLowercase("UUUUsdfsdf"));
        System.out.println(CheckIfStringContains.uppercaseAndLowercase("sdfsdf"));
        System.out.println(CheckIfStringContains.uppercaseAndLowercase("IUZTZUI"));


        System.out.println("specialCharacters");

        System.out.println(CheckIfStringContains.specialCharacters("1!()_:-23"));
        System.out.println(CheckIfStringContains.specialCharacters("123"));

        */

        System.out.println("checkPasswordValidation");
        System.out.println("final : "+checkPasswordValidation("sdffsd3445435ASDASD____"));

        System.out.println("final : "+checkPasswordValidation("sdffsd3445435____"));
        System.out.println("final : "+checkPasswordValidation("3445435ASDASD____"));
        System.out.println("final : "+checkPasswordValidation("sdffsdASDASD____"));
        System.out.println("final : "+checkPasswordValidation("sdffsdASDASD"));


        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Generate Password");

        System.out.println("final : "+checkPasswordValidation(generatePassword()) );



    }






    static public boolean checkPasswordValidation( String password) {

        System.out.println("----------------------------------");
        System.out.println("CheckPasswordValidation");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Password : "+password);
        System.out.println("");



        System.out.println("CheckIfStringContains.atLeast8Characters : " + CheckIfStringContains.atLeast8Characters(password));
        System.out.println("CheckIfStringContains.containsDigits : " + CheckIfStringContains.containsDigits(password));
        System.out.println("CheckIfStringContains.uppercaseAndLowercase : " + CheckIfStringContains.uppercaseAndLowercase(password));
        System.out.println("CheckIfStringContains.specialCharacters : " + CheckIfStringContains.specialCharacters(password));



        return  CheckIfStringContains.atLeast8Characters(password) &&
                CheckIfStringContains.containsDigits(password)  &&
                CheckIfStringContains.uppercaseAndLowercase(password) &&
                CheckIfStringContains.specialCharacters(password)  ;
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




 class CheckIfStringContains {


     static public boolean atLeast8Characters( String password) {
         return password.length() >= 8;
     }


     static public boolean containsDigits( String password) {
         return password.matches(".*[0-9].*");
     }

     static public boolean uppercaseAndLowercase ( String password) {
         return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
     }





     static public boolean aCommonlyUsedPasswords ( String password) {



         return false;
     }


     static public boolean specialCharacters ( String password) {
         return password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*");
     }






}