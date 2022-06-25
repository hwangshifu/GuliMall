package com.hwangshifu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.gulimall.product.entity.SkuImagesEntity;
import com.hwangshifu.common.utils.PageUtils;

import java.util.Map;

/**
 * sku图片
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 14:21:48
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

