package com.springJDBC.com.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.com.springJDBC.DAO.ProductsDao;
import com.springJDBC.com.springJDBC.entities.Products;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			
            System.out.println( "program started...." );
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
             ProductsDao dao = context.getBean("productsDao", ProductsDao.class);
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

            Products prod = new Products();
            prod.setId(125);
            System.out.println("deleting " + prod .getId());
            int update = dao.delete(prod);
            System.out.println(update + " Row deleted");
		} catch (Exception e) {
			// TODO: handle exception
		}
    }	
}
