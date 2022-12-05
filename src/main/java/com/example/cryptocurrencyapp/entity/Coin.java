package com.example.cryptocurrencyapp.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "COINS")
public class Coin {
    @Field(name = "symbol")
    private String symbol;
    @Field(name = "quote")
    private String quote;
}
