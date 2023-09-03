package com.example.object.section05;

import lombok.AccessLevel;
import lombok.Getter;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@Getter()
public abstract class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public Movie(String title, Duration runningTime, Money fee, List<DiscountCondition> discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = Arrays.asList((DiscountCondition) discountConditions);
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private Money calculateDiscountAmount(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    abstract protected Money calculateDiscountAmount();

//    private Money calculateAmountDiscountAmount() {
//        return discountAmount;
//    }
//
//    private Money calculatePercentDiscountAmount() {
//        return fee.times(discountPercent);
//    }
//
//    private Money calculateNoneDiscountAmount() {
//        return Money.ZERO;
//    }

}

