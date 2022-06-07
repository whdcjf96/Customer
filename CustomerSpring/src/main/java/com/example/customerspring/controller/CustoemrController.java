package com.example.customerspring.controller;

import com.example.customerspring.model.Customer;
import com.example.customerspring.service.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.customerspring.controller
 * fileName : CustoemrController
 * author : jc
 * date : 2022-06-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-06-07         jc          최초 생성
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CustoemrController {
    @Autowired
    private CustomerServiceImpl customerService;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/customers")
    public ResponseEntity<Object> getAllCustomers(){

        List<Customer> customers = customerService.findAll();
        return new ResponseEntity<Object>(customers, HttpStatus.)

    }
}
