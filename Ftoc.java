import java.util.Scanner;

public class Ftoc {
    public static void main(String[] args) {
        double celsius;
        System.out.println("Welcome to Fahrenheit to Celsius converter");
        System.out.println("         ");
        System.out.println("Enter the fahrenheit value to be converted");
        Scanner input = new Scanner(System.in);
        double fahrenheitValue = input.nextDouble();
        celsius = (fahrenheitValue-32)* 5/9;
        System.out.println("The celsius value is "+ celsius+"C");

    }
}