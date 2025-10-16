package com.springJDBC.com.springJDBC.DAO;

import com.springJDBC.com.springJDBC.entities.Products;

public interface ProductsDao {

	public int insert(Products products);
	public int update(Products products);
    public int delete(Products products);
}
