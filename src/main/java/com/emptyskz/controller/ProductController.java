package com.emptyskz.controller;


import com.emptyskz.pojo.Product;
import com.emptyskz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    //查询产品详情
    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true)Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Product byId = productService.findById(id);
        System.out.println(byId);
        modelAndView.addObject("products",byId);
        modelAndView.setViewName("product-show");
        return modelAndView;
    }
}
