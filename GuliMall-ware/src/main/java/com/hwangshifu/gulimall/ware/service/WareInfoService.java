package com.hwangshifu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hwangshifu.common.utils.PageUtils;
import com.hwangshifu.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:51:55
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

