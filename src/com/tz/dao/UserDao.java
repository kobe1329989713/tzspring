package com.tz.dao;

import com.tz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/22/ 2:19 星期二<BR>
 * <p>
 * <B>系统名称：</B>tzspring<BR>
 * <B>概要说明：</B>tzspring<BR>
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<User> findUser(){
        String sql = "SELECT id,username,address,password,email,create_time FROM tz_user";
        final List<User> users = new ArrayList<User>();
        jdbcTemplate.query(sql, new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int index) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
                users.add(user);
                return user;
            }
        });
        return users;
    }

    public boolean saveUser(User user) {
        String sql = " INSERT INTO tz_user(username, password, age, address, email) VALUES (?, ?, ?, ?, ?); ";
        int count = jdbcTemplate.update(sql, user.getUsername(),
                user.getPassword(),
                user.getAge(),
                user.getAddress(),
                user.getEmail()
        );
        return count > 0 ? true : false;
    }







}
