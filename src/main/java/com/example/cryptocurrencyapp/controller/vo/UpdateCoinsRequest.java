package com.example.cryptocurrencyapp.controller.vo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCoinsRequest {
    private List<CoinRequest> coinRequest;
}
