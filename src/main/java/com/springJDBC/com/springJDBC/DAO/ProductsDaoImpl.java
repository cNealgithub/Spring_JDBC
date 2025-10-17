package com.springJDBC.com.springJDBC.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.com.springJDBC.entities.Products;
import org.springframework.jdbc.core.RowMapper;

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

    public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
}
