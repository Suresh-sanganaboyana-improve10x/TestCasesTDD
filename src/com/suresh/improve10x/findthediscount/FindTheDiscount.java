package com.suresh.improve10x.findthediscount;

public class FindTheDiscount {
    public float findTheFinalPrice(float price, float discount) {
        float finalPrice = 0;
        float findDiscount = price*discount/100;
         finalPrice = price-findDiscount;
        return finalPrice;
    }
}
