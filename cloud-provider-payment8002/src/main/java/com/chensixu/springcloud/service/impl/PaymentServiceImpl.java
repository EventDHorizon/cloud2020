package com.chensixu.springcloud.service.impl;

import com.chensixu.springcloud.dao.PaymentDao;
import com.chensixu.springcloud.entities.Payment;
import com.chensixu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 支付服务接口
 * @author chensixu
 * @date 2023/2/7 0:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
