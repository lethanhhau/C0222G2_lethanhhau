package module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.service;

import module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.model.Product;

import java.util.*;

public class ProductManager implements IServiceProduct{
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();
    @Override
    public void add() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Product Code: ");
        String productCode = scanner.nextLine();
        System.out.print("Enter price : ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name,id,productCode,price);
        products.add(product);
    }

    @Override
    public void display() {
        for (Product product:products) {
            System.out.println(product);
        }

    }

    @Override
    public void delete() {
        System.out.print("Enter Id delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
                break;
            }else {
                System.out.println(id + " not found!");
            }
        }
    }

    @Override
    public void search() {
        System.out.print("Enter name: ");
        String nameSearch = scanner.nextLine();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(nameSearch)){
                System.out.println(products.get(i));
                break;
            }else {
                System.out.println(nameSearch + " not found!");
            }
        }
    }

    @Override
    public void update() {
        System.out.print("Enter Id edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null&&products.get(i).getId() == idEdit){
                System.out.print("Enter Name Edit: ");
                products.get(i).setName(scanner.nextLine());
                System.out.print("Enter id Edit: ");
                products.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter ProductCode Edit: ");
                products.get(i).setProductCode(scanner.nextLine());
                System.out.print("Enter price Edit: ");
                products.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
    }
    @Override
    public void sort() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });
}
}
