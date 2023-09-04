import java.util.Scanner;

//Write a program to display "Hello Welcome To Our Hood!"
public class CodeWithGeena {

    //Starting Point
    public static void main(String[]args){

        System.out.println("Hello welcome to our hood!");

/*Write a program which let user provide the current year and
the year of birth and displays the user's age in years
Every program that requires input and processing needs a variable to be declared*/
        //Variable declaration section
        int currentYear;
        int yearOfBirth;

        //Input section
//To configure the input line
        Scanner inputLine = new Scanner(System.in);
//prompt user to input current year
System.out.println("Please enter currentYear: ");
        currentYear = inputLine.nextInt();

        //prompt user to input year of birth
        System.out.print("Please enter your year of birth: ");
        //capture the birth year
        yearOfBirth = inputLine.nextInt();

        //Processing section
        //declare a variable for the sum
        int ageInYears;
        ageInYears = currentYear - yearOfBirth;
// Output section
        System.out.print("Age in years" + ageInYears);




        //Processing section
        //output section

    }
}
