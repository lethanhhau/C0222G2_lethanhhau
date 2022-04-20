package hau.quan_ly_phuong_tien.view;

import hau.quan_ly_phuong_tien.controller.PhuongTienController;
import hau.quan_ly_phuong_tien.service.impl.PhuongTienService;

public class PhuongTienView {
    public static void main(String[] args) {
        new PhuongTienController().display();
    }
}
