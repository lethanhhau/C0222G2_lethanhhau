package module2.ss17_binary_file_and_serialization.bai_tap.ss1_product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("1.Display ProductManagements \n" +
                    "2.Add new ProductManagements \n" +
                    "3.Search ProductManagements \n" +
                    "4.Exit \n" +
                    "Enter Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }
        }
    }
}
