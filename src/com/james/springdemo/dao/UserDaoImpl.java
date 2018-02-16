package com.james.springdemo.dao;

import com.james.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User queryUser(int userId) {

         User user=new User();
        String sql="select a.* from shop.user a where a.user_id=?";
        jdbcTemplate.query(sql, new Object[]{userId}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUserId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                user.setUserPassword(resultSet.getString(3));
            }
        });

        return user;
    }
}
