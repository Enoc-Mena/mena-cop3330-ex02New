/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex02;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        int count = 0;
        String inputStr;

        Scanner input = new Scanner(System.in);
        System.out.print("What is string? ");
        inputStr = input.nextLine();

        for(int i = 0; i<inputStr.length(); i++) {

            if(inputStr.charAt(i) != 0) {

                count++;

            }

        }

        System.out.print(inputStr + " has " + count + " characters");

    }

}
