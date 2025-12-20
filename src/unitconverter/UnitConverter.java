package unitconverter;

import java.util.Scanner;

public class UnitConverter {

    public static void run(Scanner scanner) {
         boolean running = true;

         while (running) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

             int choice = scanner.nextInt();