package smesterproject;

import java.util.Scanner;

public class MainClass {
//Scanner object to use anywhere in program

    static Scanner input = new Scanner(System.in);

//International Flights
    static String[] NewYork = {"Islamabad to NewYork", "10", "24/06/2019", "10:00:00"};
    static String[] Dubai = {"Islamabad to Dubai", "10", "26/06/2019", "09:00:00"};
    static String[] Saudia = {"Islamabad to Saudia", "10", "28/06/2019", "14:00:00"};

//Within Country Flights
    static String[] Karachi = {"Islamabad to Karachi", "10", "23/06/2019", "16:00:00"};
    static String[] Lahore = {"Islamabad to Lahore", "10", "29/06/2019", "08:00:00"};
    static String[] Multan = {"Islamabad to Multan", "10", "26/06/2019", "21:00:00"};

////International Passenger Details
//    static String[][] NewYorkPassengers = new String[10][3];
//    static String[][] DubaiPassengers = new String[10][3];
//    static String[][] SaudiaPassengers = new String[10][3];
//
////Local Passenger Details
//    static String[][] KarachiPassengers = new String[10][3];
//    static String[][] LahorePassengers = new String[10][3];
//    static String[][] MultanPassengers = new String[10][3];

//Main Method
    public static void main(String[] args) {
        printHeader();
        actionBlock();
    }

    public static void DeleteFlight() {
        System.out.println("Available Flights: ");
        System.out.println("1)Islamabad to NewYork");
        System.out.println("2)Islamabad to Dubai");
        System.out.println("3)Islamabad to Saudia");
        System.out.println("4)Islamabad to Karachi");
        System.out.println("5)Islamabad to Lahore");
        System.out.println("6)Islamabad to Multan");
        System.out.println("\nPress any key to exit.");
        System.out.print("Enter your choice 1~6 which flight do you want to delete: ");
        String choice = input.next();
        switch (choice) {
            case "1":
                for (int i = 1; i < NewYork.length; i++) {
                    NewYork[i] = "Canceled";
                }
                System.out.println("\nNewYork Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String i = input.next();
                if ("y".equals(i)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case "2":
                for (int j = 1; j < Dubai.length; j++) {
                    Dubai[j] = "Canceled";
                }
                System.out.println("\nDubai Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String j = input.next();
                if ("y".equals(j)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case "3":
                for (int k = 1; k < Saudia.length; k++) {
                    Saudia[k] = "Canceled";
                }
                System.out.println("\nSaudia Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String k = input.next();
                if ("y".equals(k)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case "4":
                for (int l = 1; l < Karachi.length; l++) {
                    Karachi[l] = "Canceled";
                }
                System.out.println("\nKarachi Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String l = input.next();
                if ("y".equals(l)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case "5":
                for (int m = 1; m < Lahore.length; m++) {
                    Lahore[m] = "Canceled";
                }
                System.out.println("\nLahore Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String m = input.next();
                if ("y".equals(m)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            case "6":
                for (int n = 1; n < Multan.length; n++) {
                    Multan[n] = "Canceled";
                }
                System.out.println("\nMultan Flight is canceled");
                System.out.println("\nPress y to check status of flights.");
                System.out.println("\nPress any key to exit.");
                String n = input.next();
                if ("y".equals(n)) {
                    CheckSchedule();
                } else {
                    System.out.println("\nThanks for using our Application!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
        }
    }

//Reserve a seat.
    private static void reserveSeat() {

        System.out.println("Available Flights: ");

        System.out.println("\n==>Intrnational Flights<==");
        System.out.println("1)Islamabad to NewYork");
        System.out.println("2)Islamabad to Dubai");
        System.out.println("3)Islamabad to Saudia");

        System.out.println("\n==>Local Flights<==");
        System.out.println("1)Islamabad to Karachi");
        System.out.println("2)Islamabad to Lahore");
        System.out.println("3)Islamabad to Multan");

        String[] coustomer = new String[3];
        System.out.print("Enter Your Name: ");
        coustomer[0] = input.nextLine();

        System.out.print("Enter Flight Name: ");
        coustomer[1] = input.nextLine();

        System.out.print("Enter number of seats 1~10: ");
        coustomer[2] = input.next();
        while(Integer.parseInt(coustomer[2])< 1 || Integer.parseInt(coustomer[2])>10)
        {
            System.out.println("Invalid Number of seats!\nEnter number of seats in range 1~10\n");
            System.out.print("Enter number of seats 1~10: ");
            coustomer[2] = input.next();
        }

        System.out.println("\nCongratulation! Yor seat is reserved.");

        System.out.println("\nPress 'c' to check status.");
        System.out.println("\nPress any key to exit.");
        String choice = input.next();
        if ("c".equals(choice)) {
            System.out.println("Name: " + coustomer[0]);
            System.out.println("Flight: " + coustomer[1]);
            System.out.println("Number of Seats: " + coustomer[2]);
        } else {
            System.out.println("\nThanks for using our Application!");
            System.exit(0);
        }

    }
//Show Shedule of All Flights.

    public static void CheckSchedule() {
        System.out.printf("%-40s%-25s%-25s%-25s", "Flight Name", "Total Seats", "Fligt Date", "Flight Time");
        System.out.println("");
        System.out.printf("%-40s%-25s%-25s%-25s", NewYork[0], NewYork[1], NewYork[2], NewYork[3]);
        System.out.println("");
        System.out.printf("%-40s%-25s%-25s%-25s", Dubai[0], Dubai[1], Dubai[2], Dubai[3]);
        System.out.println("");
        System.out.printf("%-40s%-25s%-25s%-25s", Saudia[0], Saudia[1], Saudia[2], Saudia[3]);
        System.out.println("");

        System.out.printf("%-40s%-25s%-25s%-25s", Karachi[0], Karachi[1], Karachi[2], Karachi[3]);
        System.out.println("");
        System.out.printf("%-40s%-25s%-25s%-25s", Lahore[0], Lahore[1], Lahore[2], Lahore[3]);
        System.out.println("");
        System.out.printf("%-40s%-25s%-25s%-25s", Multan[0], Multan[1], Multan[2], Multan[3]);
        System.out.println("");

    }

//Header of program.
    public static void printHeader() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             Welcome to our                ");
        System.out.println("       Flight Management Application       ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

//Perform action to go to Administration block or Coustomer block.
    public static void actionBlock() {

        System.out.println("1)Administration");
        System.out.println("2)Coustomer");
        System.out.println("Press any key to Exit");
        System.out.println("\nEnter your choice:");
        String option = input.nextLine();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        switch (option) {

            case "1":
                System.out.println("\n~~~~~You are in Administration Block~~~~~\n");
                actionAdmin();
                //Continue to next Step
                Continue();
                break;
            case "2":
                System.out.println("\n~~~~~You are in Coustomer Block~~~~~\n");
                actionCoustomer();
                //Continue to next Step
                Continue();
                break;
            default:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
        }
    }

//If user to go to next step than continue otherwise exit the program.
    public static void Continue() {
        char a = CharContinue();
        //continue to next step
        if (a == 'y') {
            Continue1();
        } else {
            System.out.println("\nThanks for using our Application!");
            System.exit(0);
        }
    }

//Ask user if he want to continue program and taking input as y/n.
    public static char CharContinue() {
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
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        return c;
    }

//Used in Continue() method to Continue to Program.
    public static void Continue1() {

        System.out.println("\nWhere do you want to go?");
        System.out.println("1)Administration Block.");
        System.out.println("2)Coustomer Block.");
        System.out.print("\nEnter your choice:");
        input.nextLine();
        String option = input.nextLine();
        System.out.println("");
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        switch (option) {
            case "1":
                System.out.println("\n~~~~~You are in Administration Block~~~~~\n");
                actionAdmin();
                break;
            case "2":
                System.out.println("\n~~~~~You are in Coustomer Block~~~~~\n");
                actionCoustomer();
                break;

            default:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;

        }
    }

//Perform action in Administration Block.
    public static void actionAdmin() {
        System.out.println("\nAdministration Functions:");
        System.out.println("1)Show Available Flights.");
        System.out.println("2)Insert Flight.");
        System.out.println("3)Cancel Flight.");
        System.out.println("Press any key to Exit.");
        System.out.println("\nEnter your choice:");
        String option = input.nextLine();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        switch (option) {

            case "1":
                System.out.println("\n\t\t\t\t\t~~~~~Available Flights~~~~~\n");

                //This Method Display Details of Available Flights
                CheckSchedule();

                //Continue to next Step
                Continue();
                break;
            case "2":
                System.out.println("\n\t\t\t\t\t~~~~~Inserting Flight~~~~~\n");
                System.out.println("///////////////////////   Function   ///////////////////////");
                System.out.println("///////////////////////   Required   ///////////////////////");

                //Continue to next Step
                Continue();
                break;
            case "3":
                System.out.println("\n\t\t\t\t\t~~~~~Canceling Flight~~~~~\n");

                //Canceling a Flight.
                DeleteFlight();
                //Continue to next Step.
                Continue();
                break;

            default:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
        }
    }
//Perform action in Coustomer Block.

    public static void actionCoustomer() {
        System.out.println("\nCoustomer Functions:");
        System.out.println("1)Show Availabe Flights.");
        System.out.println("2)Reserve Seat.");
        System.out.println("Press any key to Exit.");
        System.out.println("\nEnter your choice:");
        String option = input.nextLine();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        switch (option) {

            case "1":
                System.out.println("\n\t\t\t\t\t~~~~~Available Flights~~~~~\n");

                //This Method Display Details of Available Flights
                CheckSchedule();

                //Continue to next Step
                Continue();
                break;
            case "2":
                System.out.println("\nPlease Enter Required Data to Reserve your Seat");

                //This method reserve a seat for user
                reserveSeat();

                //Continue to next Step
                Continue();
                break;
            default:
                System.out.println("\nThanks for using our Application!");
                System.exit(0);
                break;
        }
    }
}
