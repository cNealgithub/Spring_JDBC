package com.springJDBC.com.springJDBC.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.com.springJDBC.entities.Products;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

public class ProductsDaoImpl implements ProductsDao{
	

	private JdbcTemplate template;

	@Override
	public int insert(Products products) {
		String query = "insert into products(id, Name, Quantity) values(?,?,?)";
		int update = this.template.update(query, products.getId(), products.getName(), products.getQuantity());
		return update;
	}
    @Override
	public int update(Products products) {
		String query = "update products set Name=?, Quantity=? where id=?";
		int update = template.update(query, products.getName(), products.getQuantity(), products.getId());
		return update;
	}

    @Override
    public int delete(Products products) {
        String query = "delete from products where id=?";
        int update = template.update(query, products.getId());
        return update;
    }

    @Override
    public Products selectobj(int product_id) {
        String query = "select * from products where id = ?";
        RowMapper<Products> rowMapper = new RowMapperImpl();
        Products products = template.queryForObject(query,rowMapper, product_id);
        return products;
    }
    @Override
	public List<Products> getAllProucts() {
		// selecting all the products in database
    	String query = "select * from products";
    	List<Products> allProds = template.query(query, new RowMapperImpl());
		return allProds;
	}

    public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
}
