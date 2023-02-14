package com.chensixu.springcloud.dao;

import com.chensixu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 支付dao接口
 * @author chensixu
 * @date 2023/2/6 23:53
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
