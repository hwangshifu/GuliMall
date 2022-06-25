package com.hwangshifu.gulimall.order.dao;

import com.hwangshifu.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:50:10
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
