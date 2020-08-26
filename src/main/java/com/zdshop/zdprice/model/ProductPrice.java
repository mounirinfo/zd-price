package com.zdshop.zdprice.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ProductPrice extends Price {
    private String productId;

    @Builder
    public ProductPrice(String currency, float price, String productId) {
        super(currency, price);
        this.productId = productId;
    }
}
