package com.zdshop.zdprice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Price {
    private String currency;
    private float price;
    //private Discount discount;
}
