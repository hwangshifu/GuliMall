package com.hwangshifu.gulimall.coupon.dao;

import com.hwangshifu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:21:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
