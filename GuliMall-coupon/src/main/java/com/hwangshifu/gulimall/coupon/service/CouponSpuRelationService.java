package com.hwangshifu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:21:29
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

