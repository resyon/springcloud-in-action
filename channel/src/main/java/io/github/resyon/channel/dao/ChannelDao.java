package io.github.resyon.channel.dao;

import io.github.resyon.channel.entity.ChannelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-渠道表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:11:15
 */
@Mapper
public interface ChannelDao extends BaseMapper<ChannelEntity> {
	
}
