package com.hwangshifu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.gulimall.product.entity.BrandEntity;
import com.hwangshifu.common.utils.PageUtils;

import java.util.Map;

/**
 * 品牌
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 14:21:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

