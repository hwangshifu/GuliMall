package com.hwangshifu.gulimall.member.feign;

import com.hwangshifu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author SANQI
 */
@FeignClient(value = "gulimall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/detectHealth")
    R detectHealth();
}
