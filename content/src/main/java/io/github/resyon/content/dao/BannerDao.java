package io.github.resyon.content.dao;

import io.github.resyon.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:45:33
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
