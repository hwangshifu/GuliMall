package com.hwangshifu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:21:29
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

