package com.sabot.manage_sys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay {

    private Integer payId;
    private String paymentItem;
    private Integer ownerId;
    private Integer usageAmount;
    private Integer totalCost;
    private Integer payStatus;
    private Date date;
}
