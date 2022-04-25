package module2.ss17_binary_file_and_serialization.bai_tap.ss1_product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
        private final static String FILE_NAME ="src/module2/ss17_binary_file_and_serialization/bai_tap/ss1_product_" +
                "manager_saves_to_binary_files/Product_Management.csv";

    public static void main(String[] args) {
        List<ProductManagement> productManagements = new ArrayList<>();
        productManagements.add(new ProductManagement("A1234","haohao",
                "media",5000d));
        productManagements.add(new ProductManagement("B1234","honda",
                "honda",50000000d));
        productManagements.add(new ProductManagement("C1234","kfc",
                "kfc",50000d));
        writerToFile(FILE_NAME,productManagements);
        List<ProductManagement> productManagementDataFromFile = readDataFromFile(FILE_NAME);
    }

    private static void writerToFile(String fileName, List<ProductManagement> productManagements) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productManagements);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<ProductManagement> readDataFromFile(String path){
        List<ProductManagement> productManagements = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productManagements = (List<ProductManagement>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return productManagements;
        }
    }

