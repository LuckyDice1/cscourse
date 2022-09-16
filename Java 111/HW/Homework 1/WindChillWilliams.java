import java.util.Scanner;

/* Course: CSCI 111, Section 2
   Student Name: John Asher Williams
   Student ID: 010925195
   Program 1 
   Due Date: 9/14/22
 
   In keeping with the Honor Code of UM, I have neither given nor received 
   inappropriate assistance from anyone other than the TA or the instructor. 
 
   Program Description: Returns the wind chill temperature (in fahrenheit)
   given the outside temperature and wind speed.
*/

public class WindChillWilliams {
    public static void main(String[] args) {
        // Decare Outside Temperature and Windspeed variables
        double temp, windSpeed, windChill;

        // Find Outside Temperature
        Scanner outTemp = new Scanner(System.in);
        System.out.println("What is the temperature outside in Celsius? >>> ");
        temp = 9/5.0 * outTemp.nextDouble() + 32; //Converting to String -> Double -> Fahrenheit Double

        // Find Wind Speed
        Scanner ws = new Scanner(System.in);
        System.out.println("What is the wind speed in km/h? >>> ");
        windSpeed = ws.nextDouble()/1.6; // Converting to String -> Double -> km/h -> mph

        // Closing Scanner class instances to prevent memory leakage (Optional, generally dont want to close System.in)
        outTemp.close();
        ws.close();

        //Calculate using the formula -> 35.74 + 0.6215(Outside Temp in Fah.) - 35.75(windSpeed in mph)^0.16 + 0.4275tv^0.16
        windChill = 35.74 + (0.6125 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
        System.out.printf("It is %.2f degrees Fahrenheit, but it feels like %.2f degrees Fahrenheit", temp, windChill);
    }
}