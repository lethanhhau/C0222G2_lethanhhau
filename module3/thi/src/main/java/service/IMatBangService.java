package service;

import model.MatBang;

import java.util.List;
import java.util.Map;

public interface IMatBangService {
    List<MatBang> selectAllMatBang();

    Map<String, String> addMatBang(MatBang matBang);

    void deleteMatBang(String maMatBang);


    List<MatBang> sortByDienTich();
}
