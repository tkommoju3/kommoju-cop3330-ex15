/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class PasswordV {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the username? ");
        String userName = input.nextLine();
        System.out.print("What is the password? ");
        String pwd = input.nextLine();

        if (pwd.equals("abc$123")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don’t know you.");
        }
    }
}





