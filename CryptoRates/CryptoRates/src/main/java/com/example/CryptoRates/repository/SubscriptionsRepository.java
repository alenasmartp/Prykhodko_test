package com.example.CryptoRates.repository;


import com.example.CryptoRates.entity.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionsRepository extends CrudRepository<Subscription, Long> {
}
