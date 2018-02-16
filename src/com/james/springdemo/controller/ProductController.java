package com.james.springdemo.controller;

import com.alibaba.fastjson.JSON;
import com.james.springdemo.entity.Product;
import com.james.springdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/productview")
    public String viewProducts(Model model){

        List<Product> products=productService.getProducts();
        model.addAttribute("products",products);
        return "ProductView";
       /*String jsonString= JSON.toJSONString(products);
       return jsonString.toString();*/
    }

}
