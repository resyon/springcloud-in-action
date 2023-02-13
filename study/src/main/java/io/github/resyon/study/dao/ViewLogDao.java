package io.github.resyon.study.dao;

import io.github.resyon.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:19:16
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
