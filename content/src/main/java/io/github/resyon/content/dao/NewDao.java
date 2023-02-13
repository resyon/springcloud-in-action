package io.github.resyon.content.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.resyon.content.entity.NewEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-咨询表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:45:33
 */
@Mapper
public interface NewDao extends BaseMapper<NewEntity> {
	
}
