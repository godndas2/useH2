package com.example.h2test;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.UserDAO;
import com.example.model.User;

@SpringBootApplication
public class H2TestApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(H2TestApplication.class, args);
		
//		    UserDAO dao = new UserDAO();
//	        User user = new User();
//	        user.setId("huhyun");
//	        user.setName("gusgodnd");
//	        user.setPassword("1111");
//
//	        dao.add(user);
//
//	        System.out.println(user.getId() + "등록 성공");
//
//	        User user2 = dao.get(user.getId());
//	        System.out.println(user2.getName());
//	        System.out.println(user2.getPassword());
//
//	        System.out.println(user2.getId() + " 조회 성공");
	}

}

