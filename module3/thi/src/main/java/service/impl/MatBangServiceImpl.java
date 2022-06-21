package service.impl;

import model.MatBang;
import repository.IMatBangRepository;
import repository.impl.MatBangRepositoryImpl;
import service.IMatBangService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatBangServiceImpl implements IMatBangService {
private IMatBangRepository iMatBangRepository =new MatBangRepositoryImpl();

    @Override
    public List<MatBang> selectAllMatBang() {
        return iMatBangRepository.getAllMatBang();
    }

    @Override
    public Map<String, String> addMatBang(MatBang matBang) {
        Map<String, String> errors = new HashMap<>();

        if (errors.isEmpty()){
            iMatBangRepository.addCustomer(matBang);
        }
        return errors;
    }

    @Override
    public void deleteMatBang(String maMatBang) {
iMatBangRepository.deleteMatBang(maMatBang);
    }

    @Override
    public List<MatBang> sortByDienTich() {
        return iMatBangRepository.sortByDienTich();
    }
}
