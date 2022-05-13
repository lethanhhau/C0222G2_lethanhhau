package on_tap.ss2.common;

import on_tap.ss1.model.SuatChieu;
import on_tap.ss2.model.MonHoc;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteReadFile {
    private static final String FILE_MON_HOC = "src/on_tap/ss2/common/mon_hoc.csv";
    /**
     * ghi File
     * Hàm dùng chung
     */
    private static void writeFile(List<String> stringList, String pathFile, Boolean flag) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hàm riêng phim
     */
    public static void writeMonHoc(List<MonHoc> monHocList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (MonHoc monHoc : monHocList) {
            stringList.add(monHoc.getInFoMonHoc());
        }
        writeFile(stringList,FILE_MON_HOC, flag);
    }

    /**
     * đọc File
     * Hàm dùng chung
     */
    private static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    /**
     * Đọc file
     * hàm riêng Employee
     */
    public static List<MonHoc> readFileMonHoc() {
        List<String> stringList = readFile(FILE_MON_HOC);
        List<MonHoc> monHocList = new ArrayList<>();
        String[] array = null;
        MonHoc monHoc = null;
        for (String str : stringList) {
            array = str.split(",");
            monHoc = new MonHoc(array[0], array[1], array[2], array[3],Integer.parseInt(array[4]));
            monHocList.add(monHoc);
        }
        return monHocList;
    }
}
