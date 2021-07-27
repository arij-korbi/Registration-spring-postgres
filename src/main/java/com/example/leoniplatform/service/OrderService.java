package com.example.leoniplatform.service;

import com.example.leoniplatform.repository.PracticeRepository;
import com.example.leoniplatform.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeService {
    @Autowired
    private PracticeRepository repo;

}
