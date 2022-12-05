package com.example.cryptocurrencyapp.service;

import com.example.cryptocurrencyapp.entity.Coin;
import com.example.cryptocurrencyapp.repository.CoinRepository;
import com.example.cryptocurrencyapp.service.dto.CoinDto;
import com.example.cryptocurrencyapp.service.mapper.CoinsServiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CoinsService {

    private final CoinRepository coinRepository;
    private final CoinsServiceMapper coinsServiceMapper;

    public void updateAllCoins(List<CoinDto> coinDtoList){
        List<Coin> coins = coinDtoList.stream().map(coinDto -> coinsServiceMapper.toCoin(coinDto)).collect(Collectors.toList());
        coinRepository.saveAll(coins);
    }

    public List<CoinDto> getAllUsdtCoins(String quoteRequest){
        List<Coin> coinList = coinRepository.findAll();

        List<CoinDto> requestedCoinDtoList=  coinList.stream()
                .filter(coin -> coin.getQuote().equals(quoteRequest))
                .map(coin -> coinsServiceMapper.toCoinDto(coin))
                .collect(Collectors.toList());

        return requestedCoinDtoList;
    }
}
