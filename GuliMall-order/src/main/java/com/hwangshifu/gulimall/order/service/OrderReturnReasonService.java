package com.hwangshifu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:50:10
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

