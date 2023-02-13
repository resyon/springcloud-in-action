package io.github.resyon.question.dao;

import io.github.resyon.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题库-题目类型
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:17
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
