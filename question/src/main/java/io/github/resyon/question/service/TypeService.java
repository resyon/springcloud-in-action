package io.github.resyon.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.resyon.common.utils.PageUtils;
import io.github.resyon.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题库-题目类型
 *
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:17
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

