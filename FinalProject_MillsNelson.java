/*
Laura Mills Nelson
Final Project - Java 1
05/14/18
 */
package finalproject_millsnelson;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adnfr
 */
public class FinalProject_MillsNelson
{

    //create global scanner
    static Scanner myScan = new Scanner(System.in);

    //global variables
    static String exit = "y";
    static String run = "y";

    //#1 - Menu System
    static void Menu()
    {
        //variables
        int Choice = -1;
        String menu = "y";

        //while loop to run menu
        while (menu.equals("y"))
        {
            System.out.print("\n\nMenu:"
                    + "\n1. Question 1, Printing xx and -- Patterns"
                    + "\n2. Question 2, Color Code"
                    + "\n3. Question 3, A List of FVCC Students"
                    + "\n4. Question 4, A Secret Message"
                    + "\n5. Exit this menu"
                    + "\n\nPlease enter your choice of 1 - 5:  ");

            try
            {
                Choice = Integer.parseInt(myScan.nextLine());

                switch (Choice)
                {
                    case 1:
                        Question1();
                        break;
                    case 2:
                        Question2();
                        break;
                    case 3:
                        Question3();
                        break;
                    case 4:
                        Question4();
                        break;
                    case 5:
                        Exit();
                        if (exit.equals("y"))
                        {
                            menu = "n";
                        }
                        break;
                    default:
                        System.out.print("\nThat wasn't a choice!!\n\n");
                }
            } catch (Exception e)
            {
                System.out.println("\nThat isn't an option!!\n\n");

            }
        }
    }

    //function to exit menu system and say goodbye
    static void Exit()
    {
        System.out.print("\nAre you sure you want to exit? Y or N:  ");

        exit = myScan.nextLine().toLowerCase();

        if (exit.equals("y"))
        {
            System.out.println("\nGoodbye.\n");
        }
    }

    //#2 -- function called Question1
    static void Question1()
    {
        //variables
        int rows = -1;
        int interval = -1;

        System.out.print("\nQuestion 1:\nYou may run a program that prints the "
                + "symobls xx and -- in a pattern, \ndepending on the numbers "
                + "entered. \nWould you like to run this program? Y or N:  ");

        run = myScan.nextLine().toLowerCase();

        //while loop to run as many times as user wishes
        while (run.equals("y"))
        {
            try
            {
                //ask user for rows
                System.out.print("\n\nHow many rows would you like?  ");

                //collect answer
                rows = Integer.parseInt(myScan.nextLine());

                //ask user for interval
                System.out.print("\nWhat number would you like to use for an "
                        + "interval?  ");

                //collect answer
                interval = Integer.parseInt(myScan.nextLine());

                System.out.println();

                //print grid immediately after each time user enters data
                for (int r = 0; r < rows; r++)
                {
                    for (int c = 0; c < 1; c++)
                    {
                        if ((r + 1) % interval == 0)
                        {
                            System.out.print("--");
                        } else
                        {
                            System.out.print("xx");
                        }
                    }
                    System.out.println();

                }
            } catch (Exception e)
            {
                System.out.println("\nThat is not an option.");
            }

            System.out.print("\nWould you like to run Question 1 again? "
                    + "Y or N:  ");

            run = myScan.nextLine().toLowerCase();

        }
    }

    //#3 -- function called Question2
    static void Question2()
    {
        //variables
        double num1 = 0.0;
        double num2 = 0.0;
        double answer = 0.0;

        System.out.print("\nQuestion 2:\nPlease enter two numbers. The two "
                + "numbers will be added together \nand the sum will produce a "
                + "color. Colors include green, yellow, \nred and black, "
                + "depending on the sum produced.\n\nWould you like to enter "
                + "a number? Y or N:  ");

        run = myScan.nextLine().toLowerCase();

        //while loop to run as many times as user wishes
        while (run.equals("y"))
        {
            //try catch statement to catch errors
            try
            {
                //ask questions and collect responses
                System.out.print("\nWhat is your first number?  ");

                num1 = Double.parseDouble(myScan.nextLine());

                System.out.print("\nWhat is your second number?  ");

                num2 = Double.parseDouble(myScan.nextLine());

                //retrieve answer from ColorCode function
                answer = ColorCode(num1, num2);

                //if statement to display answer
                if (answer >= 0.0 && answer <= 100.0)
                {
                    System.out.println("\nThe color is green.");
                } else if (answer >= 101.0 && answer <= 200.0)
                {
                    System.out.println("\nThe color is yellow.");
                } else if (answer >= 201.0 && answer <= 300.0)
                {
                    System.out.println("\nThe color is red.");
                } else
                {
                    System.out.println("\nThe color is black.");
                }
            } catch (Exception e)
            {
                System.out.println("\nThat is not an option. Try again!");
            }

            System.out.print("\nWould you like to run Question 2 again? "
                    + "Y or N:  ");

            run = myScan.nextLine().toLowerCase();

        }
    }

    //function called ColorCode
    static double ColorCode(double Number1, double Number2)
    {
        //variable
        double ans = 0.0;

        //calculate answer
        ans = Number1 + Number2;

        //return answer to Question2 function
        return ans;

    }

    //#4 -- function called Question3
    static void Question3()
    {
        //variables
        int StudentCount = 0;
        int delete = 0;

        //create arraylist
        ArrayList<FVCCStudent> FVCCstudentAL = new ArrayList();

        System.out.print("\nYou may list as many FVCC Students as you wish. "
                + "\nWould you like to add a student? Y or N:  ");

        run = myScan.nextLine().toLowerCase();

        while (run.equals("y"))
        {

            try
            {
                //create FVCC Student
                FVCCStudent student = new FVCCStudent();

                //set all attributes of student
                System.out.print("\nWhat is the first name of the student?  ");
                student.setFname(myScan.nextLine());

                System.out.print("\nWhat is the last name of the student?  ");
                student.setLname(myScan.nextLine());

                System.out.print("\nWhat is the student's major?  ");
                student.setMajor(myScan.nextLine());

                System.out.print("\nWhat is the student's GPA?  ");
                student.setGPA(Double.parseDouble(myScan.nextLine()));

                //add student to arraylist
                FVCCstudentAL.add(student);

                //count students
                StudentCount++;

                //print header
                System.out.print("\n\nFVCC Students:");

                //for statement to add to array list and print list
                for (int cntr = 0; cntr < FVCCstudentAL.size(); cntr++)
                {

                    System.out.print("\n\nStudent " + (cntr + 1) + ":\n"
                            + FVCCstudentAL.get(cntr).StudentInfo());
                }
            } catch (Exception e)
            {
                System.out.print("\nThat is not an option.");
            }

            System.out.println();

            System.out.print("\nWould you like to enter another student? "
                    + "Y or N:  ");

            run = myScan.nextLine().toLowerCase();

        }

        //if statement to allow deletion of students
        if (StudentCount > 0)
        {
            System.out.print("\nYou may select a student from the list "
                    + "and delete them.");

            System.out.print("\nWould you like to delete a student? "
                    + "Y or N:  ");

            run = myScan.nextLine().toLowerCase();

            //while loop to delete students
            while (run.equals("y"))
            {
                try
                {
                    System.out.print("\nWhich student would you like to delete? "
                            + "Enter the corresponding number:  ");

                    delete = Integer.parseInt(myScan.nextLine());

                    //remove student from arraylist
                    FVCCstudentAL.remove(delete - 1);

                    //count airplanes
                    StudentCount--;

                    //print header
                    System.out.print("\n\nFVCC Students:");

                    //for statement to add to array list and print list
                    for (int cntr = 0; cntr < FVCCstudentAL.size(); cntr++)
                    {

                        System.out.print("\n\nStudent " + (cntr + 1) + ":\n"
                                + FVCCstudentAL.get(cntr).StudentInfo());
                    }
                } catch (Exception e)
                {
                    System.out.print("\nThat is not an option.");
                }

                System.out.println();

                //if else statement to allow additional deletion of student
                if (StudentCount > 0)
                {
                    System.out.print("\nWould you like to delete another "
                            + "student? \nEnter Y or N:  ");

                    run = myScan.nextLine().toLowerCase();
                } else
                {
                    run = "n";
                }
            }
        }

    }

    //#5 -- function called Question4
    static void Question4()
    {
        System.out.println("\nQuestion 4: A Secret Message\n");

        //create array and load data set
        int[] message =
        {
            80, 82, 79, 71, 82, 65, 77, 73, 78, 71,
            32, 74, 65, 86, 65, 32, 73, 83, 32, 70,
            85, 78, 33, 10, 80, 114, 111, 103, 114,
            97, 109, 101, 114, 115, 32, 109, 97, 107,
            101, 32, 97, 32, 108, 111, 116, 32, 109,
            111, 110, 101, 121, 33, 10, 73, 32, 97, 109,
            32, 110, 111, 119, 32, 97, 32, 99, 111,
            100, 101, 32, 110, 105, 110, 106, 97, 33, 10, 10
        };

        //for statement to print array message
        for (int c = 0; c < message.length; c++)
        {
            int x;
            x = message[c];
            System.out.print((char) x);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Menu();
        
    }

}
