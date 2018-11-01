package com.pingle.pringle.controllers;

import com.pingle.pringle.domain.Product;
import com.pingle.pringle.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    private Order order;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProducts(Model model){

         model.addAttribute("products",productService.getProducts());
         return "products";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

    @RequestMapping(value = "/product/new", method = RequestMethod.POST)
    public String createProduct(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }
}
