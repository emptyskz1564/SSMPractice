package com.emptyskz.controller;


import com.emptyskz.pojo.Product;
import com.emptyskz.service.ProductService;
import com.emptyskz.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    //查询所有的产品
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Product> all = productService.findAll();
        modelAndView.addObject("productList",all);
        System.out.println(all);
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    //添加产品
    @RequestMapping("/save")
    public String save(Product product){
        productService.save(product);
        return "redirect:findAll";
    }
}
