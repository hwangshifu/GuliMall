package com.hwangshifu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.hwangshifu.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 14:21:49
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

