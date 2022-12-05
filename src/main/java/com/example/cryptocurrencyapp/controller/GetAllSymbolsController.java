package com.example.cryptocurrencyapp.controller;

import com.example.cryptocurrencyapp.controller.vo.CoinRequest;
import com.example.cryptocurrencyapp.controller.vo.UpdateCoinsRequest;
import com.example.cryptocurrencyapp.service.CoinsService;
import com.example.cryptocurrencyapp.service.dto.CoinDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/binance")
public class GetAllSymbolsController {

    private final CoinsService coinsService;


    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCoins(@RequestBody UpdateCoinsRequest updateCoinsRequest){
        List<CoinRequest> coinRequestList = updateCoinsRequest.getCoinRequest();
        List<CoinDto> coinDtoList = coinRequestList.stream().map(coinRequest -> CoinDto.builder().symbol(coinRequest.getSymbol()).quote(coinRequest.getQuote()).build())
                .collect(Collectors.toList());

        coinsService.updateAllCoins(coinDtoList);

        return ResponseEntity.ok("Ok");
    }
    @GetMapping("/all-coins")
    public ResponseEntity<List<CoinDto>> getAllUsdtCoins(@RequestParam String quote){
        return ResponseEntity.ok(coinsService.getAllUsdtCoins(quote));
    }
}
