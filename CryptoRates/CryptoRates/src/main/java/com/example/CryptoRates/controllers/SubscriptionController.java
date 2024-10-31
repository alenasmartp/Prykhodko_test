package com.example.CryptoRates.controllers;


import com.example.CryptoRates.repository.SubscriptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
    @Autowired
    private SubscriptionsRepository SubscriptionRepo;
}
