package module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.controller;

import module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.model.Product;
import module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.service.ProductManager;

import java.util.Scanner;

public class ProductController {
    ProductManager productManager = new ProductManager();
    private static Scanner scanner = new Scanner(System.in);

    public void displayMenu(){

        while (true) {
            System.out.println("-----Menu Product----");
            System.out.println(
                    "1.add.\n" +
                            "2.display. \n" +
                            "3.Delete.\n" +
                            "4.Search.\n" +
                            "5.Update. \n" +
                            "6.Sort. \n" +
                            "0.Exit.");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.search();
                    break;
                case 5:
                    productManager.update();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}
