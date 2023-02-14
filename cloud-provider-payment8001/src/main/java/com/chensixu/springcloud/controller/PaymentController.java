package com.chensixu.springcloud.controller;

import com.chensixu.springcloud.entities.CommonResult;
import com.chensixu.springcloud.entities.Payment;
import com.chensixu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author chensixu
 * @date 2023/2/7 0:08
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("插入支付信息结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else
        {
            return new CommonResult(444, "插入数据失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
        public CommonResult<Payment> getPaymrntById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);

        log.info("查询结果:热部署" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else
        {
            return new CommonResult(444, "查询失败");
        }
    }
}
