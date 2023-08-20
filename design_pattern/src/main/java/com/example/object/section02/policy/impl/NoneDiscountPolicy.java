package com.example.object.section02.policy.impl;

import com.example.object.section02.Money;
import com.example.object.section02.Screening;
import com.example.object.section02.policy.DiscountPolicy;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
