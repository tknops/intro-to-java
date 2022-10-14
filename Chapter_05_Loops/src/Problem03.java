/**
 * Write a program that displays the following table.
 *
 * Celsius    Fahrenheit
 * 0                32.0
 * 2                35.6
 * ...
 * 98              208.4
 * 100             212.0
 *
 * @author tknops
 */

public class Problem03 {

    public static void main(String[] args) {
        int celsius = 0;

        System.out.println("Celsius    Fahrenheit");
        for (int i = 0; i <= 50; i++) {
            double celsiusToFahrenheit = celsius * (9.0 / 5.0) + 32; // Calculates fahrenheit.
            System.out.printf("%-10d %10.1f\n", celsius, celsiusToFahrenheit); // Output format.

            celsius += 2;
        }
    }
}
