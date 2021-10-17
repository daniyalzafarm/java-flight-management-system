package flightfinal;

import java.util.Scanner;

public class FlightFinal
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner ( System.in );
        int i=0;
        System.out.println("***************************************************************");
        System.out.println("********Welcome to Airline Reservation Managment System********");
        System.out.println("***************************************************************");
        System.out.println("");
        System.out.println("For Booking Flight Press Any Number Rather Then 1");
        System.out.println("For Exit Press : 1");
        System.out.println("");
        System.out.println("     ****************************************************");
        int mod = x.nextInt();
          if(mod==1)
          {
              System.out.println("Thanks For Visiting Us !");
          }
          else
          {
            System.out.println("How Many Tickets Do You Want To Buy : ");
            int tickets = x.nextInt();
            String myArray[][]= new String [tickets][5];
            String Deletion[][]= new String[tickets][5];
            while(i<tickets)
          {
            flightbooking(myArray,i);
            String ticketn=  Integer.toString(i);
            System.out.println("Ticket Number : "+ticketn);
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
            myArray[i][4]=ticketn;
            i++;
          }
              while(true)
              {
              System.out.println("If You Want To Check Your ticket Detail Press : 1 ");   
              System.out.println("If You Want To Delete Your ticket Press : 2 ");
              System.out.println("For Exit Press Any Number Other Then 1 and 2");
              System.out.println("****************************************************");
              int detail=x.nextInt();
              if(detail==1)
              {
                  System.out.println("Enter Your Ticket Number ");
                  int TicketNumber = x.nextInt();
                  for(int q=0;q<myArray.length;q++)
                  {
                     if(q==TicketNumber)
                          {
                              System.out.println("****************************************************");
                              System.out.println("Your Route is : "+myArray[q][0]);
                              System.out.println("Your Time is : "+myArray[q][1]);
                              System.out.println("Your First Name is : "+myArray[q][2]);
                              System.out.println("Your Last Name is : "+myArray[q][3]);
                              System.out.println("Your Ticket Number is : "+myArray[q][4]);
                              System.out.println("****************************************************");
                              break;
                          }
                     else
                         continue;
                  }
              }
              else if(detail==2)
              {
                System.out.println("Enter Your Ticket Number ");
                int TicketNumber = x.nextInt();
                for(int q=0;q<myArray.length;q++)
                  {
                    for(int k=0;k<myArray[0].length;k++)
                    {
                     if(q==TicketNumber)
                          {
                              
                          }
                     else
                     {
                         Deletion[q][k]=myArray[q][k];
                     }
                    }
                  }
                   System.out.println("Your Ticket is Canceled !");
                for(int q=0;q<myArray.length;q++)
                  {
                    for(int k=0;k<myArray[0].length;k++)
                    {
                        myArray[q][k]=Deletion[q][k];
                    }
                  }
                  System.out.println("If you want to check your ticket deletion visit checking section to check it");
              }
              else
              {
                  System.out.println("Thanks For Visiting Us !");
                  break;
              }
              }
          }
    }
    
    public static String[][] flightbooking(String[][] myArray,int i)
   {
       int count=0;
       System.out.println("****************************************************");
       Scanner x = new Scanner ( System.in );
       System.out.println("For International Flight press : 1");
       System.out.println("For Domestic Flight press : 2");
       System.out.println("****************************************************");
       while(true)
       {
        int a=x.nextInt();
         if(a==1)
          {
               String s1="CANADA";
               String s2="AMERICA";
               String s3="FRANCE";
               String s4="CHINA";
               String s5="GERMANY";
               route(myArray,s1,s2,s3,s4,s5,i);
               System.out.println("Your ticket is booked ! you can check it's details");
               break;
          }
         else if (a==2)
          {
               String s1="ISLAMABAD";
               String s2="LAHORE";
               String s3="FAISALABAD";
               String s4="KARACHI";
               String s5="SARGODHA";
               route(myArray,s1,s2,s3,s4,s5,i);
               System.out.println("Your ticket is booked ! you can check it's details");
               break;
          }
         else
          {
             System.out.println("Invalid input ! : Re-Enter Route ");
          }
       }
    return myArray ;
   }
    
    public static void route (String [][] myArray,String s1,String s2,String s3,String s4,String s5,int i)
   {
          //  int p=0;
           Scanner x = new Scanner ( System.in );
           System.out.println("For "+s1+" : Press 1 ");
           
           System.out.println("For "+s2+" : Press 2 ");
           
           System.out.println("For "+s3+" : Press 3 ");
           
           System.out.println("For "+s4+" : Press 4 ");
           
           System.out.println("For "+s5+" : Press 5 ");
           

           while(true)
           {
             
            int b=x.nextInt();
           if(b==1)
           {
               myArray[i][0]=s1;
               time(myArray,s1,s2,s3,s4,s5,i);
               break;
           }
           else if (b==2)
           {
               myArray[i][0]=s2;
               time(myArray,s1,s2,s3,s4,s5,i);
               break;
           }
           else if (b==3)
           {
               myArray[i][0]=s3;
               time(myArray,s1,s2,s3,s4,s5,i);
               break;
           }
           else if (b==4)
           {
               myArray[i][0]=s4;
               time(myArray,s1,s2,s3,s4,s5,i);
               break;
           }
           else if (b==5)
           {
               myArray[i][0]=s5;
               time(myArray,s1,s2,s3,s4,s5,i);
               break;
           }
           else 
           {
               System.out.println("Invalid input ! : Re-Enter Route, Plz enter valid numeric key");
           }
           }              
    }
    
    public static void time (String [][] myArray,String s1,String s2,String s3,String s4,String s5,int i)
   {
               int y=0;
               Scanner x = new Scanner ( System.in );
               System.out.println("For 9:00 AM Flight : Press 1");
               String t1="9:00 AM";
               System.out.println("For 3:00 PM Flight : Press 2");
               String t2="3:00 PM";
               System.out.println("For 12:00 AM Flight : Press 3");
               String t3="12:00 AM";
               while(true)
               {
               int c=x.nextInt();
               if(c==1)
               {
                   myArray[i][1]=t1;
                   name(myArray,i);
                   break;
               }
               else if (c==2)
               {
                   myArray[i][1]=t2;
                   name(myArray,i);
                   break;
               }
               else if (c==3)
               {
                   myArray[i][1]=t3;
                   name(myArray,i);
                   break;
               }
               else
               {
                    System.out.println("Invalid input ! : Re-Enter Flight Time,Plz enter valid numeric key ");
               }
               }
   }
    
    public static void name(String[][] myArray,int i)
   {
        Scanner x = new Scanner ( System.in );
        System.out.println("Enter First Name : ");
        String n1=x.nextLine();
        myArray[i][2]=n1;
        System.out.println("Enter Last Name : ");
        String n2=x.nextLine();
        myArray[i][3]=n2;
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
   }
}
