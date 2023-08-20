package com.example.object.section02.policy.impl;

import com.example.object.section02.Money;
import com.example.object.section02.Screening;
import com.example.object.section02.condition.DiscountCondition;
import com.example.object.section02.policy.DiscountPolicy;

import java.util.List;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(List.of(conditions));
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
