package com.pluralsight;
import java.util.Scanner;
import java.util.Arrays;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner bookScanner = new Scanner(System.in);


        //20 books requirement
        String[] bookList = {
                "The House of The Scorpion", "The Lord of Opium", "Xisle", "Goosebumps HorrorLand", "The Great Controversy",
                "The Hunger Games", "Heaven is for Real", "Sound Bender", "MiddleSchool, The Worst Years of MY LIFE", "THE HOUSE ON MANGO STREET",
                "MIDDLEWORLD", "WOLF STORM", "You Can if You Think You Can", "LOCKDOWN", "SOLITARY", "DEATH SENTENCE", "FUGITIVES",
                "EXECUTION", "DARE TO WIN"
        };

        Arrays.sort(bookList);
        for (String books : bookList) {
            System.out.println(books);
        }

        System.out.println();

    }
}
