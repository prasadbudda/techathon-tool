/*
 * Creation : 18-Aug-2017
 */
package com.techathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techathon.entity.Product;
import com.techathon.service.ProductService;

@Controller
@RequestMapping("api/v1")
public class TechathonController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> productList = productService.getAllProduct();
        return new ResponseEntity<>(productList, HttpStatus.OK);

    }

}
