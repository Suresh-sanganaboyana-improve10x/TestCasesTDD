package com.suresh.improve10x.findthedicount;

public class FindTheDiscount {
    public float findTheFinalPrice(float price, float discount) {
        float findDiscount = price*discount/100;
        float finalPrice = price-findDiscount;
        return finalPrice;
    }
}
