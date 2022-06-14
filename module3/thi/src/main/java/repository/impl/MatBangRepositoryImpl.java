package repository.impl;

import connection.DBConnection;
import model.MatBang;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepositoryImpl implements IMatBangRepository {
    private DBConnection dbConnection = new DBConnection();
    private final String SELECT_ALL_MAT_BANG = "select * from mat_bang";
    private final String INSERT_MAT_BANG = " INSERT INTO `mat_bang` (`ma_mat_bang`, `dien_tich`, `trang_thai`, " +
            " `tang`, `loai_mat_bang`, `gia_tien`, `ngay_bat_dau`, `ngay_ket_thuc`) Values(?, ?, ?, ?, ?, ?, ?,?)";
    private final String DELETE_MAT_BANG = " delete from mat_bang " +
            " where ma_mat_bang = ? ";
    private static final String SORT_BY_DIEN_TICH = "select * from mat_bang order by `dien_tich`";

    @Override
    public List<MatBang> getAllMatBang() {
        List<MatBang> matBangList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_MAT_BANG);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma_mat_bang");
                double dienTich = resultSet.getDouble("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                int tang = resultSet.getInt("tang");
                String loaiMatBang = resultSet.getString("loai_mat_bang");
                double giaTien = resultSet.getDouble("gia_tien");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");

                MatBang matBang = new MatBang(maMatBang, dienTich, trangThai, tang, loaiMatBang, giaTien, ngayBatDau, ngayKetThuc);
                matBangList.add(matBang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return matBangList;
    }

    @Override
    public void addCustomer(MatBang matBang) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MAT_BANG);
            preparedStatement.setString(1, matBang.getMaMatBang());
            preparedStatement.setDouble(2, matBang.getDienTich());
            preparedStatement.setString(3, matBang.getTrangThai());
            preparedStatement.setInt(4, matBang.getTang());
            preparedStatement.setString(5, matBang.getLoaiMatBang());
            preparedStatement.setDouble(6, matBang.getGiaTien());
            preparedStatement.setString(7, matBang.getNgayBatDau());
            preparedStatement.setString(8, matBang.getNgayKetThuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteMatBang(String maMatBang) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_MAT_BANG);
            preparedStatement.setString(1, maMatBang);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<MatBang> sortByDienTich() {
        List<MatBang> matBangList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SORT_BY_DIEN_TICH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String maMatBang = resultSet.getString("ma_mat_bang");
                double dienTich = resultSet.getDouble("dien_tich");
                String trangThai = resultSet.getString("trang_thai");
                int tang = resultSet.getInt("tang");
                String loaiMatBang = resultSet.getString("loai_mat_bang");
                double giaTien = resultSet.getDouble("gia_tien");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");

                MatBang matBang = new MatBang(maMatBang,dienTich,trangThai,tang,loaiMatBang,giaTien,ngayBatDau,ngayKetThuc);
                matBangList.add(matBang);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return matBangList;
    }
}


