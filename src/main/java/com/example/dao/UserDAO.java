package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.User;

public class UserDAO {

//	 public void add(User user) throws ClassNotFoundException, SQLException {
//	        Class.forName("org.h2.Driver");
//	        Connection c = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//	        PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) values(?, ?, ?)");
//	        ps.setString(1, user.getId());
//	        ps.setString(2, user.getName());
//	        ps.setString(3, user.getPassword());
//
//	        ps.executeUpdate();
//
//	        ps.close();
//	        c.close();
//	    }
//
//	    public User get(String id) throws ClassNotFoundException, SQLException {
//	        Class.forName("org.h2.Driver");
//	        Connection c = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//	        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
//	        ps.setString(1, id);
//
//	        ResultSet rs = ps.executeQuery();
//	        rs.next();
//	        User user = new User();
//	        user.setId(rs.getString("id"));
//	        user.setName(rs.getString("name"));
//	        user.setPassword(rs.getString("password"));
//
//	        rs.close();
//	        ps.close();
//	        c.close();
//
//	        return user;
//	    }
}
