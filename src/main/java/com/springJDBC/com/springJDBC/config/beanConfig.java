package com.springJDBC.com.springJDBC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC.com.springJDBC.DAO.ProductsDao;
import com.springJDBC.com.springJDBC.DAO.ProductsDaoImpl;

@Configuration

public class beanConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_core");
		ds.setUsername("root");
		ds.setPassword("Neal$$2005");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	@Bean("productsDao")
	public ProductsDao productsDao() {
		ProductsDaoImpl dao= new ProductsDaoImpl();
		dao.setTemplate(getJdbcTemplate());
		return dao;
	}
}
