package io.github.resyon.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.content.entity.NewEntity;

import java.util.Map;

/**
 * 内容-咨询表
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:45:33
 */
public interface NewService extends IService<NewEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

