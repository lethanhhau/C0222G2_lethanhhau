package on_tap.ss1.common;

import hau.case_study_furama_resort.model.facility_model.Vila;
import hau.case_study_furama_resort.model.person_model.Employee;
import on_tap.ss1.model.SuatChieu;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteReadFile {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final String FILE_PHIM = "src/on_tap/ss1/common/phim.csv";
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
    public static void writeSuatChieu(List<SuatChieu> suatChieuList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (SuatChieu suatChieu : suatChieuList) {
            stringList.add(suatChieu.getInFoSuatChieu());
        }
        writeFile(stringList,FILE_PHIM, flag);
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
    public static List<SuatChieu> readFileSuatChieu() {
        List<String> stringList = readFile(FILE_PHIM);
        List<SuatChieu> suatChieuList = new ArrayList<>();
        String[] array = null;
        SuatChieu suatChieu = null;
        for (String str : stringList) {
            array = str.split(",");

            Date date = new Date();
            suatChieu = new SuatChieu(array[0], array[1], date,Integer.parseInt(array[3]));
            suatChieuList.add(suatChieu);
        }
        return suatChieuList;
    }
}
