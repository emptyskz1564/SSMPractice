package com.emptyskz.controller;

import com.emptyskz.pojo.Orders;
import com.emptyskz.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<Orders> all = ordersService.findAll();
        modelAndView.addObject("ordersList",all);
        modelAndView.setViewName("orders-list");

        return modelAndView;
    }

//    @RequestMapping("/findAll")
//    public ModelAndView findAll(
//            @RequestParam(name="page",required = true,defaultValue = "1" ) int page ,
//            @RequestParam(name = "size" ,required = true,defaultValue = "4") int size
//    ){
//        ModelAndView modelAndView = new ModelAndView();
//        List<Orders> all = ordersService.findAll(page,size);
//        PageInfo pageInfo = new PageInfo<Orders>(all);
//        System.out.println(pageInfo);
//        modelAndView.addObject("pageInfo",pageInfo);
//        modelAndView.setViewName("orders-page-list");
//
//        return modelAndView;
//    }

    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true) Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Orders byId = ordersService.findById(id);
        System.out.println(byId);
        modelAndView.addObject("orders",byId);
        modelAndView.setViewName("orders-show");
        return null;
    }

}
