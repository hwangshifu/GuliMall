package com.hwangshifu.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwangshifu.gulimall.coupon.dao.CouponDao;
import com.hwangshifu.gulimall.coupon.entity.CouponEntity;
import com.hwangshifu.gulimall.coupon.service.CouponService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements CouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponEntity> page = this.page(
                new Query<CouponEntity>().getPage(params),
                new QueryWrapper<CouponEntity>()
        );

        return new PageUtils(page);
    }

}