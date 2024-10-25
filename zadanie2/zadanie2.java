package zadanie2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class zadanie2 {
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_GBP = 0.75;
    private static final double USD_TO_RUB = 73.0;
    private static final double USD_TO_JPY = 110.0;
    private static final double USD_TO_AUD = 1.35;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Введите сумму в долларах: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Пожалуйста, введите корректное число.");
            scanner.next(); // Очистка некорректного ввода
        }
        double amountInUSD = scanner.nextDouble();

        System.out.println("Конвертированная сумма:");
        System.out.println("EUR: " + df.format(amountInUSD * USD_TO_EUR));
        System.out.println("GBP: " + df.format(amountInUSD * USD_TO_GBP));
        System.out.println("RUB: " + df.format(amountInUSD * USD_TO_RUB));
        System.out.println("JPY: " + df.format(amountInUSD * USD_TO_JPY));
        System.out.println("AUD: " + df.format(amountInUSD * USD_TO_AUD));

        scanner.close();
    }
}
