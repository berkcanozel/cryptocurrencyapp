package com.example.cryptocurrencyapp.repository;

import com.example.cryptocurrencyapp.entity.Coin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends MongoRepository<Coin, String> {

    // additional custom finder methods go here
}
