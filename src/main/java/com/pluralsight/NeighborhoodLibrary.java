package com.pluralsight;
import java.util.*;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        Scanner bookScan = new Scanner(System.in);
        int homeScreen = 0;
        Book[] bookList = new Book[20];

        bookList[0] = new Book(1, "368-927-346", "The House of The Scorpion", "", true);
        bookList[1] = new Book(2, "165-349-736", "The Lord of Opium", "", true);
        bookList[2] = new Book(3, "764-321-948", "Xisle", "", false);
        bookList[3] = new Book(4, "948-631-257", "Goosebumps HorrorLand", "", true);
        bookList[4] = new Book(5, "631-489-525", "The Great Controversy", "", false);
        bookList[5] = new Book(6, "315-464-261", "The Hunger Games", "", false);
        bookList[6] = new Book(7, "542-311-354", "Heaven is for Real", "", true);
        bookList[7] = new Book(8, "434-268-421", "Sound Bender", "", true);
        bookList[8] = new Book(9, "624-862-482", "MiddleSchool", "", false);
        bookList[9] = new Book(10, "641-862-153", "The Worst Years of MY LIFE", "", false);
        bookList[10] = new Book(11, "452-357-458", "THE HOUSE ON MANGO STREET", "", true);
        bookList[11] = new Book(12, "842-342-184", "MIDDLEWORLD", "", true);
        bookList[12] = new Book(13, "267-458-445", "WOLF STORM", "", true);
        bookList[13] = new Book(14, "654-785-946", "You Can if You Think You Can", "", false);
        bookList[14] = new Book(15, "786-521-562", "LOCKDOWN", "", true);
        bookList[15] = new Book(16, "466-289-626", "SOLITARY", "", true);
        bookList[16] = new Book(17, "964-254-561", "DEATH SENTENCE", "", true);
        bookList[17] = new Book(18, "649-842-458", "FUGITIVES", "", true);
        bookList[18] = new Book(19, "914-862-452", "Execution", "", true);
        bookList[19] = new Book(20, "543-669-852", "DARE TO WIN", "", false);

        do {
            System.out.println("Welcome to your local Neighborhood Library! We have a variety of books!\n Here are the Available books\n2 - Here" +
                    "UnAvailable books currently checked out\n0 - Exit\nPlease ENTER number associated with the book: ");
            homeScreen = bookScan.nextInt();
            switch (homeScreen) {
                case 1:
                    AvailableBooks(bookList,bookScan);
                    break;
                case 2:
                    CheckedOutBooks(bookList,bookScan);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("ERROR! input options on screen.");
                    homeScreen = 0;
            }
        }
        while (homeScreen >= 0 && homeScreen <=2);
    }
    public static void AvailableBooks(Book[] bookList, Scanner bookScan) {
        int option = 1, id = 0;
        String name = "";
        do {
            System.out.println("Current books available: ");
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i].getIsCheckedout() == false) {
                    System.out.println(bookList[i].toStringAvailableBooks());
                }
            }
            System.out.println("What would you like to do?:\n1 -Check out a book:\n0 -Return to Home Screen\nEnter: ");
            option = bookScan.nextInt();
            bookScan.nextLine();
            switch (option){
                case 1:
                    System.out.print("Who is checking out the book: ");
                    name = bookScan.nextLine();
                    System.out.print("ID of book: ");
                    id = bookScan.nextInt();
                    for (int i = 0; i < bookList.length; i++){
                        if (bookList[i].getId() == id) {
                            bookList[i].checkOut(name);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR! input options on screen.");
                    option = 1;
            }
        }while (option != 0);
    }
    public static void CheckedOutBooks(Book[] bookList, Scanner bookScan) {
        int option = 1, id = 0;
        do {
            System.out.println("Current checked out books: ");
            for (int i = 0; i < bookList.length; i++){
                if (bookList[i].getIsCheckedout() == true) {
                    System.out.println(bookList[i].toStringAvailableBooks());
                }
            }
            System.out.println("What would you like to do?:\n1 -Check in book\n0 -Or would you like to return to HomeScreen\nEnter Prompt: ");
            option = bookScan.nextInt();
            bookScan.nextLine();
            switch (option){
                case 1:
                    System.out.print("ID of book getting checked in: ");
                    id = bookScan.nextInt();
                    for (int i = 0;i < bookList.length; i++) {
                        if (bookList[i].getId()==id) {
                            bookList[i].checkIn();
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR! input options on screen.");
                    option = 1;
            }
        }
        while (option !=0);
    }
}
