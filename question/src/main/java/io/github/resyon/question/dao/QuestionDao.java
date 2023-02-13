package io.github.resyon.question.dao;

import io.github.resyon.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题库-题目
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:18
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
