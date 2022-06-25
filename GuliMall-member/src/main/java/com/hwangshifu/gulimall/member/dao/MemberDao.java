package com.hwangshifu.gulimall.member.dao;

import com.hwangshifu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hwangshifu
 * @email hwangshifuu@gmail.com
 * @date 2022-06-25 15:36:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
