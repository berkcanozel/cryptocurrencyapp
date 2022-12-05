package com.example.cryptocurrencyapp.service.mapper;

import com.example.cryptocurrencyapp.entity.Coin;
import com.example.cryptocurrencyapp.service.dto.CoinDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoinsServiceMapper {
//    @Mapping(source = "coinDto.symbol",target = "symbol")
//    @Mapping(source = "coinDto.quote",target = "quote")
    Coin toCoin(CoinDto coinDto);

    CoinDto toCoinDto(Coin coin);
}
