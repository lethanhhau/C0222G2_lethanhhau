package module2.ss17_binary_file_and_serialization.bai_tap.ss1_product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    private final static String FILE_NAME = "src/module2/ss17_binary_file_and_serialization/bai_tap/ss1_product_" +
            "manager_saves_to_binary_files/Product_Management.csv";
    private static void writerToFile(String fileName, List<ProductManagement> productManagements) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
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
