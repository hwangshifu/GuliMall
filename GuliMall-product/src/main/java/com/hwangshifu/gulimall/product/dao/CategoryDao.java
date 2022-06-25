package com.hwangshifu.gulimall.product.dao;

import com.hwangshifu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 14:21:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
