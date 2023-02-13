package io.github.resyon.member.dao;

import io.github.resyon.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户-会员表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:02:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
