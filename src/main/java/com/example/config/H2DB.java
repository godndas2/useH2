package com.example.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2DB {

//	@Bean
//	public ServletRegistrationBean h2servletResgist() {
//		ServletRegistrationBean bean = new ServletRegistrationBean(new WebServlet());
//		bean.addUrlMappings("/console/*");
//		return bean;
//	}
}
