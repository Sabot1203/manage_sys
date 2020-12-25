package com.sabot.manage_sys.dao;

import com.sabot.manage_sys.domain.PaymentItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentItemDao {

    List<PaymentItem> findPaymentItemList();

    int deletePaymentItemByName(String paymentItem);

    int updatePaymentItem(PaymentItem paymentItem);

    int insertPaymentItem(PaymentItem paymentItem);
}
