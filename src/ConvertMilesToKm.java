//Import Scanner library
import java.util.Scanner;

public class ConvertMilesToKm {
    //Start of main code
    public static void main(String[] args) {
        //Printing out start message
        System.out.println("Please enter miles:");
        //Scan for input
        Scanner milesInput = new Scanner(System.in);
        //Convert scanned data to datatype double
        double miles = milesInput.nextDouble();
        //Math
        double kilometers = miles * 1.6;
        //print result
        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }
}
