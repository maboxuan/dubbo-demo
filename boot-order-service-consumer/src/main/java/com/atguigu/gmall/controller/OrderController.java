package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {


    @Autowired
    private OrderService orderService;


    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(String userId){
        return orderService.initOrder(userId);
    }
}
