package com.springJDBC.com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.com.springJDBC.DAO.ProductsDao;
import com.springJDBC.com.springJDBC.config.beanConfig;
import com.springJDBC.com.springJDBC.entities.Products;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			
            System.out.println( "program started...." );
            //via xml
//            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            //via annotation or java config
            ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
             ProductsDao dao = context.getBean("productsDao", ProductsDao.class);

             //insert method
//    		Products prod = new Products();
//    		prod.setId(128);
//    		prod.setName("Boat stone 350");
//    		prod.setQuantity(458);
//    		int insert = dao.insert(prod);
//    		System.out.println("updated rows : " + insert);
             
             //update part
            //checking git
//             Products prod = new Products();
//             prod.setId(127);
//             prod.setName("Apple MacBook M2");
//             prod.setQuantity(500);
//             int update = dao.update(prod);
//             System.out.println("Rows updates : " + update);

            //delete method
//            Products prod = new Products();
//            System.out.print("enter the id you want to delete : ");
//            Scanner dc = new Scanner(System.in);
//            int delId = dc.nextInt();
//            prod.setId(delId);
//            System.out.println("deleting " + prod .getId());
//            int update = dao.delete(prod);
//            System.out.println(update + " Row deleted");

            //select single object
//            Products prod = dao.selectobj(128);
//            System.out.println(prod);
             
             //selecting all the products
             List<Products> allProds = dao.getAllProucts();
             for(Products pro: allProds) {
            	 System.out.println(pro);
             }

		} catch (Exception e) {
			// TODO: handle exception
		}
    }	
}
