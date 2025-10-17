package com.springJDBC.com.springJDBC.DAO;

import com.springJDBC.com.springJDBC.entities.Products;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper <Products> {
    @Override
    public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
        // we will simply return the row data comming in form of an object via creating a new products class object
        Products products = new Products();
        products.setId(rs.getInt(1));
        products.setName(rs.getString(2));
        products.setQuantity(rs.getInt(3));
        return products;
    }
}
