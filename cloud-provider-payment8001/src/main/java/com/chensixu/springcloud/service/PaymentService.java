package com.chensixu.springcloud.service;

import com.chensixu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * 支付服务接口
 * @author chensixu
 * @date 2023/2/7 0:05
 */

@Service
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById( Long id);
}
