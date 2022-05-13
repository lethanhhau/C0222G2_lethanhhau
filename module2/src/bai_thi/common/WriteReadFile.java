package bai_thi.common;

import bai_thi.model.DienThoaiChinhHang;
import bai_thi.model.DienThoaiXachTay;
import hau.case_study_furama_resort.model.person_model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    private static final String FILE_DIEN_THOAI_CHINH_HANG = "src/bai_thi/common/dien_thoai_chinh_hang.csv";
    private static final String FILE_DIEN_THOAI_XACH_TAY = "src/bai_thi/common/dien_thoai_xach_tay.csv";



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
     * Hàm riêng điện thoại chính hãng
     */
    public static void writeDienThoaiChanhHang(List<DienThoaiChinhHang> dienThoaiChinhHangList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            stringList.add(dienThoaiChinhHang.getInfoDienThoaiChinhHang());
        }
        writeFile(stringList, FILE_DIEN_THOAI_CHINH_HANG, flag);
    }


    /**
     * Hàm riêng điện thoại xách tay
     */
    public static void writeDienThoaiXachTay(List<DienThoaiXachTay> dienThoaiXachTayList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            stringList.add(dienThoaiXachTay.getInfoDienThoaiXachTay());
        }
        writeFile(stringList, FILE_DIEN_THOAI_XACH_TAY, flag);
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
 * hàm riêng điện thoại chính hãng
 */

    public static List<DienThoaiChinhHang> readFileDienThoaiChinhHang() {
        List<String> stringList = readFile(FILE_DIEN_THOAI_CHINH_HANG);
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        String[] array = null;
        DienThoaiChinhHang dienThoaiChinhHang = null;
        for (String str: stringList) {
            array = str.split(",");

            dienThoaiChinhHang = new DienThoaiChinhHang(array[0], array[1], Double.parseDouble(array[2]),
                    Long.parseLong(array[3]),array[4],array[5],array[6]);
            dienThoaiChinhHangList.add(dienThoaiChinhHang);
        }
        return dienThoaiChinhHangList;
    }

    /**
     * Đọc file
     * hàm riêng điện thoại xách tay
     */
    public static List<DienThoaiXachTay> readFileDienThoaiXaxhTay() {
        List<String> stringList = readFile(FILE_DIEN_THOAI_XACH_TAY);
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        String[] array = null;
        DienThoaiXachTay dienThoaiXachTay = null;
        for (String str: stringList) {
            array = str.split(",");

            dienThoaiXachTay = new DienThoaiXachTay(array[0], array[1], Double.parseDouble(array[2]),
                    Long.parseLong(array[3]),array[4],array[5],array[6]);
            dienThoaiXachTayList.add(dienThoaiXachTay);
        }
        return dienThoaiXachTayList;
    }
}


