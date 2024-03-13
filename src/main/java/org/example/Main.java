package org.example;


public class Main {
    public static void main(String[] args) {



        System.out.println("checkPasswordValidation");
        System.out.println("final : "+SingeltonPassword.isValidation("sdffsd3445435ASDASD____"));
        System.out.println("final : "+SingeltonPassword.isValidation("sdffsd3445435____"));
        System.out.println("final : "+SingeltonPassword.isValidation("3445435ASDASD____"));
        System.out.println("final : "+SingeltonPassword.isValidation("sdffsdASDASD____"));
        System.out.println("final : "+SingeltonPassword.isValidation("sdffsdASDASD"));

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Generate Password");

        System.out.println("final : " + SingeltonPassword.isValidation(SingeltonPassword.generatePassword()) );

    }

}


