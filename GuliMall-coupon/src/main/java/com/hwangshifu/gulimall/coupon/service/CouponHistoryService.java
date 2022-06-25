package com.hwangshifu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:21:29
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

