package com.example.leoniplatform.controller;

import com.example.leoniplatform.message.ResponseMessage;
import com.example.leoniplatform.model.File;
import com.example.leoniplatform.model.Order;
import com.example.leoniplatform.model.User;
import com.example.leoniplatform.service.FileStorageService;
import com.example.leoniplatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.leoniplatform.message.ResponseMessage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;
    @Autowired
    private FileStorageService storageService;
    @PostMapping("/addorder")
    @CrossOrigin(origins = "http://localhost:4200")
    public Order registerUser(@RequestBody Order order, @RequestParam("file") MultipartFile file) throws Exception
    { Order orderObj;
        orderObj=service.saveOrder(order);
        String message = "";

            storageService.store(file);
        orderObj.getFiles().add((File) file);
        return orderObj;
    }
    @GetMapping("/allorders")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Order> findAllOrders() throws Exception{
        List<Order> orders=service.findAllOrders();
        return orders;
    }
}
