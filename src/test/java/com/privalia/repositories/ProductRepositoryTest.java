package com.privalia.repositories;

import com.privalia.configuration.RepositoryConfiguration;
import com.privalia.domain.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={RepositoryConfiguration.class})
public class ProductRepositoryTest {

    Product product1;
    Product product2;

    @Autowired
    ProductRepository subject;

    @Before
    public void setUp(){
        product1 = new Product();
        product1.setDescription("Privalia Spring Framework");
        product1.setPrice(new BigDecimal("21.95"));
        product1.setProductId("1232");
        subject.save(product1);

        product2 = new Product();
        product2.setDescription("Privalia Hibernate Framework");
        product2.setPrice(new BigDecimal("23.85"));
        product2.setProductId("1233");
        subject.save(product2);
    }

    @After
    public void tearDown() throws Exception{
        subject.deleteAll();
    }

    @Test
    public void testSave(){
        Product product = new Product();
        product.setPrice(BigDecimal.valueOf(19.3));

        assertNull(product.getId());
        subject.save(product);
        assertNotNull(product.getId());
    }

    @Test
    public void testGetAll(){
        Iterable<Product> productsList = subject.findAll();
        long size = productsList.spliterator().getExactSizeIfKnown();
        assertEquals(size, 2);
    }

    @Test
    public void testModifyProduct(){
        final String description = "New Description";
        product1.setDescription(description);
        Product newValue = subject.save(product1);
        assertEquals(description, newValue.getDescription());
    }

    @Test
    public void testDelete(){
        subject.delete(product1.getId());
        assertNull(subject.findOne(product1.getId()));
    }

    @Test
    public void testFindByProductId(){
        assertNotNull(subject.findByProductId(product1.getProductId()));
    }

    @Test
    public void testFindByDescriptionAndPrice(){
        assertNotNull(subject.findByDescriptionAndPrice(product1.getDescription(), product1.getPrice()));
    }

    @Test
    public void testUpdateAddress(){
        assertEquals(1, subject.updateProduct(product1.getId(), "New Updated Description"));
    }
}
