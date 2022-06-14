package repository;

import model.MatBang;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> getAllMatBang();

    void addCustomer(MatBang matBang);

    void deleteMatBang(String maMatBang);

    List<MatBang> sortByDienTich();
}
