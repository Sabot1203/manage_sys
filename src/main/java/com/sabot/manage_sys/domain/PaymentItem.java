package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentItem {

    private String paymentItem;
    private Integer price;
    private String unit;
}
