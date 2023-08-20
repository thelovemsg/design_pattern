package com.example.object.section02.policy.impl;

import com.example.object.section02.Money;
import com.example.object.section02.Screening;
import com.example.object.section02.condition.DiscountCondition;
import com.example.object.section02.policy.DiscountPolicy;

import java.util.List;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... conditions) {
        super(List.of(conditions));
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
