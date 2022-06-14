package repository.impl;

import connection.DBConnection;
import model.Category;
import model.Product;
import repository.IProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private DBConnection dbConnection = new DBConnection();
    private final String SELECT_ALL_Product = "select * from product";
    private final String SELECT_ALL_CATEGORY = "select * from category";
    private final String INSERT_PRODUCT = "INSERT INTO `product`(`product_name`, `price`, `quantity`, `color`, " +
            " `describe`, `category_id`) value (?, ?, ?, ?, ?, ?)";
    private final String FIND_BY_ID = "select * from product where product_id = ?";
    private final String EDIT_PRODUCT = " UPDATE `product` " +
            " SET `product_name` = ?, `price` = ?, `quantity` = ?, `color` = ?, `describe` = ?, `category_id` = ? " +
            " WHERE (`id` = ?); ";


    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Product);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                Double price = resultSet.getDouble("price");
                Integer quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("describe");
                Integer categoryId = resultSet.getInt("category_id");

                Product product = new Product(productId, productName, price, quantity, color, describe, categoryId);
                productList.add(product);
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

        return productList;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int categoryId = resultSet.getInt("category_id");
                String categoryName = resultSet.getString("category_name");

                Category category = new Category(categoryId, categoryName);
                categoryList.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return categoryList;
    }

    @Override
    public void saveProduct(Product product) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescribe());
            preparedStatement.setInt(6, product.getCategoryId());
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
    public Product findById(int id) {
        Product product = new Product();
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                Double price = resultSet.getDouble("price");
                Integer quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String describe = resultSet.getString("describe");
                Integer categoryId = resultSet.getInt("category_id");

                product = new Product(productId, productName, price, quantity, color, describe, categoryId);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return product;
    }

    @Override
    public void editProduct(Product product) {
        Connection connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT_PRODUCT);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescribe());
            preparedStatement.setInt(6, product.getProductId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
