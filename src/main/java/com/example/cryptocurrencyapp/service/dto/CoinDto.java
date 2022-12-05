package com.example.cryptocurrencyapp.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CoinDto {
    private String symbol;
    private String quote;
}
