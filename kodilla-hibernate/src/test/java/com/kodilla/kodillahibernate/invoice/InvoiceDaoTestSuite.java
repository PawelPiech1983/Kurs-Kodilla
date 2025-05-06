package com.kodilla.kodillahibernate.invoice;

import com.kodilla.kodillahibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    /*@Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Item item = new Item(new BigDecimal(20), 1, new BigDecimal(20));
        Item item2 = new Item(new BigDecimal(10), 4, new BigDecimal(40));
        item.setProduct(product);
        item2.setProduct(product2);
        Invoice invoice = new Invoice("2025.04.26.0001");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);

    }*/
}
