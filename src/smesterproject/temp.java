package smesterproject;

import java.util.Scanner;

public class temp {

    boolean exit;
//Main Method

    public static void main(String[] args) {
        temp menu = new temp();
        menu.printHeader();
        menu.runBlock();
    }
//Print Header Statement

    void printHeader() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Welcome to our                ");
        System.out.println("       Flight Management Application       ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
//Run Menu

    void runBlock() {
        printBlocks();
        int choice = inputBlock();
        actionBlock(choice);
    }
//Print Menu

    private void printBlocks() {
        System.out.println("1)Administration");
        System.out.println("2)Coustomer");
        System.out.println("0)Exit");
    }
//Take input from menu

    private int inputBlock() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 2) {
            try {
                System.out.print("\nEnter your choice:");
                choice = input.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.println("\nINVALID SELECTION! PLEASE TRY AGAIN.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID SELECTION! PLEASE TRY AGAIN.");
            }
        }
        return choice;
    }
//Perform specified Task

    private void actionBlock(int choice) {
        switch (choice) {
            case 0:
                System.out.println("\nThanks for using our Application!");
                exit = true;
                break;
            case 1:
                Scanner input = new Scanner(System.in);
                System.out.println("\n~~~~~You are in Administration Block~~~~~");
                runAdmin();
                //choose if you want to continue to next step like go to main menu
                char a = Continue();
                //continue to next step
                if (a == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("\n~~~~~You are in Coustomer Block~~~~~");
                runCoustomer();
                //choose if you want to continue to next step like go to main menu
                char c = Continue();
                //continue to next step
                if (c == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
        }
    }
//Ask user if he want to continue program

    private char Continue() {
        Scanner input = new Scanner(System.in);
        char c = 'x';
        while (c != 'y' && c != 'n') {
            try {
                System.out.println("\nDo you want to continue? y/n");
                c = input.next().charAt(0);
                if (c != 'y' && c != 'n') {
                    System.out.println("\nINVALID INPUT! PLEASE TRY AGAIN.");
                }
            } catch (Exception e) {
                System.out.println("\nINVALID INPUT!");
            }
        }
        return c;
    }
//Continue to Program

    private void continu() {
        System.out.println("Where do you want to go?");
        System.out.println("1)Administration Block.");
        System.out.println("2)Coustomer Block.");
        int choice = inputContinu();
        switch (choice) {
            case 1:
                runAdmin();
            case 2:
                runCoustomer();
        }
    }
//Take input from continue block

    private int inputContinu() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice < 1 || choice > 2) {
            try {
                System.out.print("\nEnter your choice:");
                choice = input.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.println("\nINVALID SELECTION! PLEASE TRY AGAIN.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID SELECTION! PLEASE TRY AGAIN.");
            }
        }
        return choice;
    }
//Run Administration Block   

    private void runAdmin() {
        printAdmin();
        int choice = inputAdmin();
        actionAdmin(choice);
    }
//Print Administration Menu

    private void printAdmin() {
        System.out.println("1)Show Available Flights.");
        System.out.println("2)Insert Flight.");
        System.out.println("3)Cancel Flight.");
        System.out.println("0)Exit.");
    }
//Take input from Administration Menu

    private int inputAdmin() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 3) {
            try {
                System.out.print("\nEnter your choice:");
                choice = input.nextInt();
                if (choice < 0 || choice > 3) {
                    System.out.println("\nINVALID SELECTION! PLEASE TRY AGAIN.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID SELECTION! PLEASE TRY AGAIN.");
            }
        }
        return choice;
    }
//Perform specified task

    private void actionAdmin(int choice) {
        switch (choice) {
            case 0:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
            case 1:
                System.out.println("\n~~~~~Available Flights~~~~~");
                ///////////////////////   Function   ////////////////
                ///////////////////////   Required   ////////////////

                //choose if you want to continue to next step like go to main menu
                char a = Continue();
                //continue to next step
                if (a == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("\n~~~~~Inserting Flight~~~~~");
                ///////////////////////   Function   ////////////////
                ///////////////////////   Required   ////////////////

                //choose if you want to continue to next step like go to main menu
                char b = Continue();
                //continue to next step
                if (b == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case 3:
                System.out.println("\n~~~~~Canceling Flight~~~~~");
                ///////////////////////   Function   ////////////////
                ///////////////////////   Required   ////////////////

                //choose if you want to continue to next step like go to main menu
                char c = Continue();
                //continue to next step
                if (c == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
        }
    }
//Run coustomer block

    private void runCoustomer() {
        printCoustomer();
        int choice = inputCoustomer();
        actionCoustomer(choice);
    }
//Print coustomer block menu

    private void printCoustomer() {
        System.out.println("1)Show Availabe Flights.");
        System.out.println("2)Reserve Seat.");
        System.out.println("0)Exit.");
    }
//Take input from Coustomer Menu

    private int inputCoustomer() {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 2) {
            try {
                System.out.print("\nEnter your choice:");
                choice = input.nextInt();
                if (choice < 0 || choice > 2) {
                    System.out.println("\nINVALID SELECTION! PLEASE TRY AGAIN.");
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID SELECTION! PLEASE TRY AGAIN.");
            }
        }
        return choice;
    }
//Perform specified task

    private void actionCoustomer(int choice) {
        switch (choice) {
            case 0:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
            case 1:
                System.out.println("\n~~~~~Available Flights~~~~~");
                ///////////////////////   Function   ////////////////
                ///////////////////////   Required   ////////////////

                //choose if you want to continue to next step like go to main menu
                char a = Continue();
                //continue to next step
                if (a == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("\nPlease Enter Required Data to Reserve your Seat");
                ///////////////////////   Function   ////////////////
                ///////////////////////   Required   ////////////////

                //choose if you want to continue to next step like go to main menu
                char b = Continue();
                //continue to next step
                if (b == 'y') {
                    continu();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
        }
    }
}
