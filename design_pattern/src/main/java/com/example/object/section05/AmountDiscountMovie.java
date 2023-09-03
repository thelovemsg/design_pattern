package com.example.object.section05;

import java.time.Duration;
import java.util.List;

public class AmountDiscountMovie extends Movie{

    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee, Money discountAmount, DiscountCondition... conditions) {
        super(title, runningTime, fee, List.of(conditions));
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return null;
    }
}
