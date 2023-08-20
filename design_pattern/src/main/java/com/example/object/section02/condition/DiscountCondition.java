package com.example.object.section02.condition;

import com.example.object.section02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
