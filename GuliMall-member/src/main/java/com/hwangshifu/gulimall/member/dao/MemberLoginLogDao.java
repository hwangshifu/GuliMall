package com.hwangshifu.gulimall.member.dao;

import com.hwangshifu.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:36:56
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
