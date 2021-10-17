package student_managment_system;

import java.util.Arrays;
import java.util.Scanner;

public class Student_Managment_System {

    public static void main(String[] args) {
//           calling of class vatage method and output is going to an array.
        double[] classmarks = Classvatage(Assignment(), Quizzes(), Sessional_One(), Sessional_two(), Terminal());
//        calling of method and output is going to an array.
        double[] labmarks = Labvatage(LabAssignment(), LabSessional_One(), LabSessional_two(), LabTerminal());
        /*//        method calling and returning output to array*/
        double[] overall = Overall(classmarks, labmarks);
        /*//        method calling and returning output to array*/
        String[] students = Students();
        /*//        method calling and returning output to array*/
        double[] assignment = Assignment();
        /*//        method calling and returning output to array*/
        double[] quizzes = Quizzes();
        /*//        method calling and returning output to array*/
        double[] s1 = Sessional_One();
        /*//        method calling and returning output to array*/
        double[] s2 = Sessional_two();
        /*//        method calling and returning output to array*/
        double[] terminal = Terminal();
        /*//        method calling and returning output to array*/
        double[] labassignment = LabAssignment();
        /*//        method calling and returning output to array*/
        double[] ls1 = LabSessional_One();
        /*//        method calling and returning output to array*/
        double[] ls2 = LabSessional_two();
        /*//        method calling and returning output to array*/
        double[] labterminal = LabTerminal();
        /*//        method calling and returning output to array*/
        String[] gpa = GPA(overall);
        /*//        method calling  */
        display(students, assignment, quizzes, s1, s2, terminal, labassignment, ls1, ls2, labterminal, overall, gpa);
        System.out.println("");
        /*//     creating input object from scanner class   */
        Scanner input = new Scanner(System.in);
        /*//    Asking user Desired questions    */
        System.out.println("What operation u want to do?");
        System.out.println("1)  Sorting");
        System.out.println("2)  Deleting");
        int x = input.nextInt();
        /*//    using Switch Statement for user entered choices for further operations    */
        switch (x) {
            case 0:
                System.out.println("Sorry :(  You have entered wrong command");
                System.out.println("Program is Closing");
                System.exit(0);
                break;
            case 1:
                System.out.println("***___ SORTED ___***");
                System.out.println("");
                /*//   Method calling and returnig its output into an array     */
                int[] counter = sortf(overall);
                /*//   Method Calling     */
                Studentsort(counter, students, assignment, quizzes, s1, s2, terminal,
                        labassignment, ls1, ls2, labterminal, overall, gpa);
                break;
            case 2:
                /*//  Normal method Calling      */
                Delete(students, assignment, quizzes, s1, s2, terminal, labassignment, ls1, ls2, labterminal, overall, gpa);
                break;
        }
    }

    /*//    Method Creation    */
    public static String[] Students() {
        String[] students = {"Ahmad", "Ali", "Ashraf", "Asim"};

        return students;

    }

    /*//    Method Creation    */
    public static double[] Assignment() {

        double[] assignment = {6.0, 0, 9.3, 7.4};
        return assignment;

    }

    /*//    Method Creation    */
    public static double[] LabAssignment() {

        double[] labassignment = {6.5, 8.5, 9, 5};
        return labassignment;

    }

    /*//    Method Creation    */
    public static double[] Quizzes() {
        double[] quizzes = {13, 15, 10, 8.5};

        return quizzes;

    }

    /*//    Method Creation    */
    public static double[] LabTerminal() {
        double[] labterminal = {45, 50, 35, 42.5};

        return labterminal;

    }

    /*//    Method Creation    */
    public static double[] Sessional_One() {

        double[] sessional1 = {8.5, 10, 7.5, 9};

        return sessional1;

    }

    /*//    Method Creation    */
    public static double[] LabSessional_One() {

        double[] labsessional1 = {7, 8.5, 9, 5};

        return labsessional1;

    }

    /*//    Method Creation    */
    public static double[] Sessional_two() {

        double[] sessional2 = {13, 11, 12.5, 7.5};

        return sessional2;

    }

    /*//    Method Creation    */
    public static double[] LabSessional_two() {

        double[] labsessional2 = {14, 12, 14.5, 9.5};

        return labsessional2;

    }

    /*//    Method Creation    */
    public static double[] Terminal() {

        double[] terminal = {45.0, 30.0, 48.0, 42.5};

        return terminal;

    }

    /*//    Method Creation    */
    public static void display(String m[], double n[], double o[], double p[], double q[],
            double r[], double s[], double t[], double u[], double v[], double[] w, String[] x) {
        /*//    Usng printf method for a standered display of output   */
        System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s\n", "Roll NO", "Student", "Assignment", "Quizz", "Sessional 1",
                "Sessional 2", "Terminal", "Lab Assign", "Lab S1", "Lab S2", "Lab Terminal", "Total Marks", "GPA");
        System.out.println("");
        /*//    Initializing  for loop   */
        for (int i = 0; i < m.length; i++) {
            /*//    Usng printf method for a standered display of output   */
            System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s", (i + 1), m[i], n[i], o[i], p[i], q[i], r[i],
                    s[i], t[i], u[i], v[i], w[i], x[i]);
            System.out.println("");
        }
    }

    /*//    Method Creation    */
    public static double[] Labvatage(double as[], double s1[], double[] s2, double[] ter) {
        double[] labmarks = new double[as.length];
        /*//    Initializing  for loop   */
        for (int i = 0; i < labmarks.length; i++) {
            labmarks[i] = (as[i] * 25) / 10 + (s1[i] * 10) / 10 + (s2[i] * 15) / 10 + (ter[i]);

        }
        return labmarks;

    }

    /*//    Method Creation    */
    public static double[] Classvatage(double as[], double q[], double s1[], double[] s2, double[] ter) {
        double[] classmarks = new double[as.length];
        /*//    Initializing  for loop   */

        for (int i = 0; i < classmarks.length; i++) {
            classmarks[i] = (as[i]) + q[i] + (s1[i]) + (s2[i]) + (ter[i]);

        }
        return classmarks;

    }

    /*//    Method Creation    */
    public static double[] Overall(double m[], double n[]) {
        double[] lab = new double[m.length];
        double[] clas = new double[m.length];
        double[] overall = new double[clas.length];
        /*//    Initializing  for loop   */

        for (int i = 0; i < n.length; i++) {
            lab[i] = (n[i] * 33) / 100;
            /*//    Initializing  for loop   */

        }
        for (int i = 0; i < m.length; i++) {
            clas[i] = (m[i] * 67) / 100;
        }
        /*//    Initializing  for loop   */

        for (int i = 0; i < m.length; i++) {

            overall[i] = Math.ceil(clas[i] + lab[i]);

        }
        return overall;

    }

    /*//    Method Creation    */
    public static String[] GPA(double[] m) {
        String[] gpa = new String[m.length];
        /*//    Initializing  for loop   */

        for (int i = 0; i < m.length; i++) {
            /*//    using if-else statement for different scenarios   */
            if (m[i] <= 50) {
                gpa[i] = "FAIL";
            } else if (m[i] > 50 && m[i] < 55) {
                gpa[i] = "1.3";
            } else if (m[i] >= 55 && m[i] < 60) {
                gpa[i] = "1.7";
            } else if (m[i] >= 60 && m[i] < 65) {
                gpa[i] = "2.0";
            } else if (m[i] >= 65 && m[i] < 70) {
                gpa[i] = "2.3";
            } else if (m[i] >= 70 && m[i] < 75) {
                gpa[i] = "2.7";
            } else if (m[i] >= 75 && m[i] < 80) {
                gpa[i] = "3.0";
            } else if (m[i] >= 80 && m[i] < 85) {
                gpa[i] = "3.3";
            } else if (m[i] >= 85 && m[i] < 90) {
                gpa[i] = "3.7";
            } else if (m[i] >= 90) {
                gpa[i] = "4.0";
            }

        }
        return gpa;

    }

    /*//    Method Creation    */
    public static int[] sortf(double m[]) {
        /*//  Initializing a Counter   */

        int con = 0;

        /*//    Initiallizing an Array which consist of all the (indexes+1) changed when array is sorted to make changes
        in other Arrays  
         */
        int counter[] = new int[m.length];
        double[] temp = new double[m.length];
        System.arraycopy(m, 0, temp, 0, m.length);
        Arrays.sort(m);
        /*//    Initializing  Nested for loop   */

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] == temp[j]) {
                    con++;
                    break;
                } else {
                    con++;

                }
            }
            counter[i] = con;
            con = 0;

        }
        return counter;

    }

    /*//    Method Creation    */
    public static void Studentsort(int counter[], String student[], double n[], double o[], double p[], double q[],
            double r[], double s[], double t[], double u[], double v[], double[] w, String[] x) {
        /*//    Usng printf method for a standered display of output   */

        System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s\n",
                "Roll NO", "Student", "Assignment", "Quizz", "Sessional 1",
                "Sessional 2", "Terminal", "Lab Assign", "Lab S1", "Lab S2",
                "Lab Terminal", "Total Marks", "GPA");
        System.out.println("");
        /*//    Initializing  for loop   */

        for (int i = 0; i < student.length; i++) {
            /*//    Usng printf method for a standered display of output   */

            System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s", (i + 1), student[counter[i] - 1], n[counter[i] - 1], o[counter[i] - 1], p[counter[i] - 1], q[counter[i] - 1], r[counter[i] - 1],
                    s[counter[i] - 1], t[counter[i] - 1], u[counter[i] - 1], v[counter[i] - 1], w[i], x[counter[i] - 1]);
            System.out.println("");

        }

    }

    /*//    Method Creation    */
    public static void Delete(String m[], double n[], double o[], double p[], double q[],
            double r[], double s[], double t[], double u[], double v[], double[] w, String[] x) {
        System.out.println("Which Roll number u want to delete between 1 and " + m.length);
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        System.out.println("***___ DELETED ___***");
        System.out.println("");

        /*//    Usng printf method for a standered display of output   */
        System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s\n", "Roll NO", "Student", "Assignment", "Quizz", "Sessional 1",
                "Sessional 2", "Terminal", "Lab Assign", "Lab S1", "Lab S2", "Lab Terminal", "Total Marks", "GPA");
        System.out.println("");
        /*//    Initializing  for loop   */

        for (int i = 0; i < m.length; i++) {
            if (i == (y - 1)) {
            } else {
                /*//    Usng printf method for a standered display of output   */

                System.out.printf("%-11s%-12s%-12s%-8s%-13s%-13s%-12s%-13s%-10s%-10s%-15s%-15s%-10s", (i + 1), m[i], n[i], o[i], p[i], q[i], r[i],
                        s[i], t[i], u[i], v[i], w[i], x[i]);
                System.out.println("");
            }
        }

    }

}
