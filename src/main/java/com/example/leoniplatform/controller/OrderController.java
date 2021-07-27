package com.example.leoniplatform.controller;

import com.example.leoniplatform.service.PracticeService;
import com.example.leoniplatform.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
    @Autowired
    private PracticeService service;

}
