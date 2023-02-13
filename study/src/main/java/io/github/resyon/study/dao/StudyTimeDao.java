package io.github.resyon.study.dao;

import io.github.resyon.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:19:16
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
