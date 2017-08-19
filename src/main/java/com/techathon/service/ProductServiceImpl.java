/*
 * Creation : 18-Aug-2017
 */
package com.techathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techathon.dao.ProductDao;
import com.techathon.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProducts();
    }

}
