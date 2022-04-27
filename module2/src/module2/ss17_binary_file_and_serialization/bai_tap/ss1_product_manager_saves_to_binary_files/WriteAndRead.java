package module2.ss17_binary_file_and_serialization.bai_tap.ss1_product_manager_saves_to_binary_files;

import module2.ss12_java_collection_framework.bai_tap.practice_using_array_list_and_linked_list.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writerFile(List<Product> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_io_binary_file_and_serialization/bai_tap/common/data/data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {

            FileInputStream fileInputStream = new FileInputStream("src/ss17_io_binary_file_and_serialization/bai_tap/common/data/data.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
