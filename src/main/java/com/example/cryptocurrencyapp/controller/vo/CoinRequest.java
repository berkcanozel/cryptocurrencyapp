package com.example.cryptocurrencyapp.controller.vo;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoinRequest {
    private String base;
    private String delistTime;
    private Boolean isBaseBorrowable;
    private Boolean isBaseTransferIn;
    private Boolean isBuyAllowed;
    private Boolean isQuoteBorrowable;
    private Boolean isQuoteTransferIn;
    private Boolean isSellAllowed;
    private Boolean isTradeAllowed;
    private String marginRatio;
    private String quote;
    private String status;
    private String symbol;
}
