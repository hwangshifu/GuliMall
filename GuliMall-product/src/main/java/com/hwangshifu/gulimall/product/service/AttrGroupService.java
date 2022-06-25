package com.hwangshifu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.gulimall.product.entity.AttrGroupEntity;
import com.hwangshifu.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 14:21:48
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

