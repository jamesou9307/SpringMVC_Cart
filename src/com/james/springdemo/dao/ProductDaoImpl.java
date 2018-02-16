package com.james.springdemo.dao;

import com.james.springdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getProducts() {

        List<Product> products=new ArrayList<>();
        String sql="select a.* from shop.product a";
        jdbcTemplate.query(sql, new Object[]{}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
               Product product=new Product();
               product.setProductid(resultSet.getInt(1));
               product.setProductname(resultSet.getString(2));
               product.setProductdescription(resultSet.getString(3));
               product.setProductprice(resultSet.getFloat(4));
               products.add(product);
            }
        });
        return products;
    }
}
