package smesterproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static String dateTime() {
         DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
        String date1=dateFormat.format(date);
	System.out.println(date1);
        return (date1);
    }
    public static void main(String[] args) {
        dateTime();
        String s="10";
        int d=Integer.parseInt(s);
        int a=d-1;
        System.out.println(a);
        String[][] S=new String[10][3];
        System.out.println(S[0][1]);
        
    }
}

