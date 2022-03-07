package com.app.gtt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    BigDecimal beforeDiscount;
    BigDecimal afterDiscount;
    BigDecimal savings;
}
